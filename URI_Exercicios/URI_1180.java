package URI_Exercicios;

import java.io.IOException;
import java.util.Scanner;

public class URI_1180 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        
        int[] X = new int[N];
        
        int menor = 0, posicao = 0;
        
        for (int i = 0; i < N; i++) {
        	
        	X[i] = s.nextInt();
        	
        	if (i == 0) {
        		menor = X[i];
        		posicao = i;
        	} else if (X[i] < menor) {
        		menor = X[i];
        		posicao = i;
        	}
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
 
    }
}
