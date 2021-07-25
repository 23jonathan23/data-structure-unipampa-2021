package URI_Exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class URI_1062 {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        int count = 0;

		while (!(input = bufferReader.readLine()).equals("0")) {
			int qdtWagons = Integer.parseInt(input);

            if(count != 0)
                System.out.println();
            else
                count++;
            
			while (!(input = bufferReader.readLine()).equals("0")) {
				Stack<Integer> wagonDepartureOrder = new Stack<Integer>();

				String[] wagons = input.split("\\s");

				int actual = 0;

				int wagon = Integer.parseInt(wagons[actual]);

				for (int i = 1; i <= qdtWagons; i++) {
					wagonDepartureOrder.push(i);

					while (!wagonDepartureOrder.empty() && wagon == wagonDepartureOrder.lastElement()) {
                        actual++;

                        if (actual < qdtWagons)
							wagon = Integer.parseInt(wagons[actual]);

						wagonDepartureOrder.pop();
					}
				}
				
                if(wagonDepartureOrder.empty())
                    System.out.println("Yes");
                else
                    System.out.println("No");
			} 
		}

        System.out.println();
	}
 
}
