import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'runningMedian' function below.
     *
     * The function is expected to return a DOUBLE_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Double> runningMedian(List<Integer> a) {
        var heap = new Heap();
        List<Double> medians = new ArrayList<>();
        
        for(var number : a) {
            heap.add(number);
            medians.add(heap.findMedian());
        }
        
        return medians;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Double> result = Result.runningMedian(a);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Heap {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    
    public Heap() {
        maxHeap = new PriorityQueue<>();
        minHeap = new PriorityQueue<>(1, Collections.reverseOrder());
    }
    
    public void add(int i) {
        if (maxHeap.size() > minHeap.size()) 
            minHeap.add(i);
        else 
            maxHeap.add(i);

        //balance heap
        if (!minHeap.isEmpty() && (minHeap.peek() > maxHeap.peek())) {
            minHeap.add(maxHeap.poll());
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) //pair values
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        else //odd values
            return maxHeap.peek();
    }
}