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
     * Complete the 'getServedBuildings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY buildingCount
     *  2. INTEGER_ARRAY routerLocation
     *  3. INTEGER_ARRAY routerRange
     */

    public static int getServedBuildings(List<Integer> buildingCount, List<Integer> routerLocation, List<Integer> routerRange) {
        int buildingSize = buildingCount.size();

        List<Integer> routerCount = new ArrayList<>();

        for(int i = 0; i < buildingSize; i++) {
            routerCount.add(0);
        }
        
        for(int i = 0; i < routerLocation.size(); i++) {
            int range = routerRange.get(i);
            int startIndex = Math.max(0, routerLocation.get(i)- 1 - range);
            int endIndex = Math.min(buildingSize-1, routerLocation.get(i)- 1 + range);
            
            routerCount.add(startIndex, routerCount.get(startIndex) + 1);

            if(endIndex < (buildingSize-1))
                routerCount.add(endIndex+1, routerCount.get(endIndex) - 1);
        }

        for(int i = 1; i < buildingSize - 1; i++) {
            routerCount.add(i, routerCount.get(i) + routerCount.get(i-1));
        }

        int count = 0;

        for(int i = 0; i < buildingSize; i++) {
            if(routerCount.get(i) >= buildingCount.get(i))
                count += 1;
        }
 
        return count;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int buildingCountCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> buildingCount = IntStream.range(0, buildingCountCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int routerLocationCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> routerLocation = IntStream.range(0, routerLocationCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int routerRangeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> routerRange = IntStream.range(0, routerRangeCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.getServedBuildings(buildingCount, routerLocation, routerRange);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}