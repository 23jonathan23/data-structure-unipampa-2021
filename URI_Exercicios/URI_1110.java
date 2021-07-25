package URI_Exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class URI_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputs = new BufferedReader(new InputStreamReader(System.in));

        int number;
        String input;

        while (!(input = inputs.readLine()).equals("0")) {
            number = Integer.parseInt(input);

            StringBuilder sb = new StringBuilder();

            if(number == 0) break;

            Stack<Integer> cards = new Stack<Integer>();

            for(int i = 1; i <= number; i++)
                cards.push(i);

            sb.append("Discarded cards: ");

            while(cards.size() > 1) {
                if(cards.size() <= 2) {
                    sb.append(cards.firstElement());
                    cards.remove(cards.firstElement());
                } else {
                    sb.append(cards.firstElement() + ", ");
                    cards.remove(cards.firstElement());
                    cards.add(cards.firstElement());
                    cards.remove(cards.firstElement());
                }
            }

            sb.append("\nRemaining card: " + cards.firstElement());
            System.out.println(sb.toString());
        }
    }
}
