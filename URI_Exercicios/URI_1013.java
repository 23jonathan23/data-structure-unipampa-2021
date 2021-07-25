package URI_Exercicios;

import java.util.Scanner;

public class URI_1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int maior = input.nextInt();
        
        int B = input.nextInt();
        int C = input.nextInt();
        
        var numeros = new int[] {B, C};
        
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }   
        }
        
        System.out.println(maior + " eh o maior");
    }
}
