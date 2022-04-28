// See https://aka.ms/new-console-template for more information

public class FizzBuzz {
    public void execute(int n) {
        var multipleThree = false;
        var multipleFive = false;

        for(var i = 1; i <= n; i++) {
            multipleThree = (i % 3) == 0;
            multipleFive = (i % 5) == 0;

            if(multipleThree && multipleFive)
                Console.WriteLine("FizzBuzz");
            else if(multipleThree)
                Console.WriteLine("Fizz");
            else if(multipleFive)
                Console.WriteLine("Buzz");
            else
                Console.WriteLine(i);
        }
    } 
}
