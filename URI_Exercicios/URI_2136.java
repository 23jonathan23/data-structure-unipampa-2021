package URI_Exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
 
public class URI_2136 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        
        String line;

        List<String> possibleFriends = new ArrayList<String>();

        List<String> notFriends = new ArrayList<String>();

        while(!(line = bufferReader.readLine()).equals("FIM")) {
            String[] inscription = line.split("\\s");

            String participant = inscription[0];
            String response = inscription[1];

            if(response.equals("YES") && !possibleFriends.contains(participant)) {       
                possibleFriends.add(participant);
            } else if(response.equals("NO")){  
                notFriends.add(participant);
            }
        }

        String winner = "";
        int lastValue = 0;

        for(String p : possibleFriends) {
            if(p.length() > lastValue) {
                winner = p;
                lastValue = p.length();
            }
        }

        possibleFriends.sort((a1, a2) -> a1.compareTo(a2));

        notFriends.sort((a1, a2) -> a1.compareTo(a2));

        StringBuilder sb = new StringBuilder();

        for(String name : possibleFriends)
            sb.append(name + "\n");

        for(String name : notFriends)
            sb.append(name + "\n");
        
        System.out.println(sb.toString());
        System.out.println("Amigo do Habay:");
        System.out.println(winner);
    }
 
}