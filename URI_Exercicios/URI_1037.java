package URI_Exercicios;

import java.io.IOException;
import java.util.Scanner; 

public class URI_1037 {
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
         
         var number = input.nextFloat();
         
         if (number >= 0 && number<= 25.00 )  {
             System.out.println("Intervalo [0,25]");
         }  else if(number > 25.00 && number <= 50.00)  {
             System.out.println("Intervalo (25,50]");
         }  else if(number > 50.00 && number<= 75.00)  {
             System.out.println("Intervalo (50,75]"); 
         }  else if (number > 75.00 && number <=100.00)  {
             System.out.println("Intervalo (75,100]");
         } else  {
             System.out.println("Fora de intervalo");
         }
    }
}
