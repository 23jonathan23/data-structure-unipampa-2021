package URI_Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1259 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Integer> numbers = new ArrayList<>();
		List<Integer> pairNumbers 	= new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		
		int numberInputs = scan.nextInt();

		for (int i = 0 ; i < numberInputs ; i++)
            numbers.add(scan.nextInt());
				
		for (int number: numbers){
			if (number % 2 == 0) {
				pairNumbers.add(number);
                continue;
            }
			
            oddNumbers.add(number);
		}
		
        Collections.sort(oddNumbers);
		Collections.reverse(oddNumbers);

		Collections.sort(pairNumbers);
		
		for (Integer pairNumber: pairNumbers)
			System.out.println(pairNumber);
		
        for (Integer oddNumber: oddNumbers)
			System.out.println(oddNumber);
		
		scan.close();
	}
}