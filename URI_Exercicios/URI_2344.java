package URI_Exercicios;

import java.util.Scanner;

public class URI_2344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int gradeNumber = scan.nextInt();

		char gradeLetter = ' ';

		if (gradeNumber == 0) 
			gradeLetter = 'E';
		else if (gradeNumber>=1 && gradeNumber<=35) 
			gradeLetter = 'D';
		else if (gradeNumber>=36 && gradeNumber<=60) 
			gradeLetter = 'C';
		else if (gradeNumber>=61 && gradeNumber<=85) 
			gradeLetter = 'B';
		else if (gradeNumber>=86 && gradeNumber<=100) 
			gradeLetter = 'A';
					
		System.out.println(gradeLetter);

		scan.close();
	}
}