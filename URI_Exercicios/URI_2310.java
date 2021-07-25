package URI_Exercicios;

import java.io.IOException;
import java.util.Scanner;

public class URI_2310 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

		int qtdPlayers = scanner.nextInt();

        int qtdInputsPerPlayer = 6;

		int[] inputs = new int[qtdInputsPerPlayer];

		for (int i = 0; i < qtdPlayers; i++) {
            scanner.next(); //Ignora o nome

			for (int i2 = 0; i2 < qtdInputsPerPlayer; i2++)
                inputs[i2] += scanner.nextInt();
		}

        double plunder = (inputs[3] * 100.0) / inputs[0];

        System.out.println(String.format("Pontos de Saque: %.2f", plunder) + " %.");
		
        double blocked = (inputs[4] * 100.0) / inputs[1];

        System.out.println(String.format("Pontos de Bloqueio: %.2f", blocked) + " %.");
        
		double attacks = (inputs[5] * 100.0) / inputs[2];

        System.out.println(String.format("Pontos de Ataque: %.2f", attacks) + " %.");
    }
}
