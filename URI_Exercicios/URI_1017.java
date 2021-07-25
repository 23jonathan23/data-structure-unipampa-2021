package URI_Exercicios;

import java.util.Scanner;

public class URI_1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        
        var km = A * B;
        
        float amountLiters = (float) km / 12;
        
        System.out.printf("%.3f\n",amountLiters);
    }
}
