package URI_Exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class URI_1548 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numberTestCases = Integer.parseInt(br.readLine());
		
		while(numberTestCases > 0) {
			numberTestCases --;
			
			int numberStudents = Integer.parseInt(br.readLine());

			String[] gradeList = br.readLine().split("\\s+");

			List<Integer> gradeListInt = new ArrayList<>();

			for(int i = 0; i < gradeList.length; i++)
				gradeListInt.add(Integer.parseInt(gradeList[i]));

			Collections.sort(gradeListInt);

			Collections.reverse(gradeListInt);
			
			int total = 0;
			
			for(int i = 0; i < gradeList.length; i++)
				if (Integer.parseInt(gradeList[i]) == gradeListInt.get(i))
					total++;
			
			System.out.println(total);
		}
	}
}
