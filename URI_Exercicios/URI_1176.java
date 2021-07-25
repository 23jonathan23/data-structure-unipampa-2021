package URI_Exercicios;

import java.io.IOException;
import java.util.Scanner;

public class URI_1176 {
    public static void main(String[] args) throws IOException {
 
		long fibonacci[]= new long[61];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		Scanner s =new Scanner(System.in);

		int numberCases = s.nextInt();

		for (int i = 0; i < numberCases; i++) {
			int number = s.nextInt();
			
			for (int p = 2; p < 61; p++) {
				fibonacci[p] = fibonacci[p - 1] + fibonacci[p - 2];
				if (number == 0) {
					System.out.print("Fib("+0+") = "+0+"\n");
					break;
				}else if (number == 1) {
					System.out.print("Fib("+1+") = "+1+"\n");
					break;
				}

                if (p == number) {
                    System.out.print("Fib("+p+") = " + fibonacci[p]+"\n");
                }
			}
			
		}
 
    }
}
