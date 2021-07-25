package URI_Exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI_2065 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		
        String[] numbers = bufferReader.readLine().split("\\s");

        int numberCashiers = Integer.parseInt(numbers[0]);
        
        int numberCustumers = Integer.parseInt(numbers[1]);

        String[] dataCashier = bufferReader.readLine().split("\\s");

        String[] dataCustomer = bufferReader.readLine().split("\\s");
		
		int[] timeEachCashiers = new int[numberCashiers];

        for(int i = 0; i < numberCustumers; i++) {
            if(i < numberCashiers) {
                int time = (Integer.parseInt(dataCustomer[i]) * Integer.parseInt(dataCashier[i]));
				
                timeEachCashiers[i] = time;
			} else {
                int positionMinorTime = getIndexMinOrMaxValue(timeEachCashiers, false);
				
                int currentTimeCashier = timeEachCashiers[positionMinorTime];
                
                int time = (Integer.parseInt(dataCustomer[i]) * Integer.parseInt(dataCashier[positionMinorTime]));

                timeEachCashiers[positionMinorTime] = (currentTimeCashier + time);
			}
        }
		
        System.out.println(timeEachCashiers[getIndexMinOrMaxValue(timeEachCashiers, true)]);
    }

    static private int getIndexMinOrMaxValue(int[] array, boolean max) {
        int index = 0;
        int currentValue = array[0];

        if(max) {
            for(int i = 0; i < array.length; i++) {
                if(currentValue < array[i]) {
                    index = i;
                    currentValue = array[i];
                }
            }
        } else {
            for(int i = 0; i < array.length; i++) {
                if(currentValue > array[i]) {
                    currentValue = array[i];
                    index = i;
                }
            }
        }

        return index;		
    }
 
}