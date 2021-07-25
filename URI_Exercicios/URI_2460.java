package URI_Exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class URI_2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        bufferReader.readLine();

        Stack<String> peopleListId = new Stack<String>();
        
        String[] line = bufferReader.readLine().split("\\s");

        for (String id : line) {
            peopleListId.push(id);
        }

        bufferReader.readLine();

        line = bufferReader.readLine().split("\\s");

        StringBuilder sb = new StringBuilder();

        for (String peopleLeftId : line) {
            peopleListId.remove(peopleLeftId);
        }
        
        for(String peopleId : peopleListId) {
            if(peopleListId.lastElement() != peopleId) {
                sb.append(peopleId + " ");
                continue;
            }

            sb.append(peopleId);
        }

        System.out.println(sb.toString());
    }
}
