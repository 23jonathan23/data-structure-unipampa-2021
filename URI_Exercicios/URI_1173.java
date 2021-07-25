package URI_Exercicios;

import java.io.IOException;
import java.util.Scanner;

public class URI_1173 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        var numbers = new int[10];

        numbers[0] = s.nextInt();

        for (int i = 0; i < (10 - 1); i++) {
            numbers[i+1] = numbers[i] * 2;
        }

        for (int i=0; i < 10; i++) {
            System.out.println("N["+ i +"] = " + numbers[i]);
        }
    }
}
