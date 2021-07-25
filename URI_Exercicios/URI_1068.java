package URI_Exercicios;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI_1068 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String input = scanner.nextLine();

	        int parenthesesOpening = 0;
            
            try {
                for (int i = 0; i < input.length(); i++) {
                    char characterExpression = input.charAt(i);
                    
                    if(characterExpression == ')') {
                        if(parenthesesOpening == 0){
                            throw new Exception();
                        }
                        
                        parenthesesOpening--;
                    }
    
                    if(characterExpression == '(') {
                        parenthesesOpening++;
                    }
                }
    
                if (parenthesesOpening > 0) {
                    System.out.println("incorrect");
                } else {
                    System.out.println("correct");
                }

            } catch(Exception ex) {
                System.out.println("incorrect");
            }
		}
    }
 
}