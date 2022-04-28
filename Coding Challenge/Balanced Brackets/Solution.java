import java.util.*;

class Result {

    public static String isBalanced(String s) {
        int numbersOfChars = s.length();

        if (numbersOfChars % 2 != 0)
            return "NO";

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else if (ch == '(')
                stack.push(')');
            else if (stack.isEmpty() || ch != stack.peek())
                return "NO";
            else
                stack.pop();
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder();

        int qtdInputs = scanner.nextInt();

        for (int i = 0; i < qtdInputs; i++) {
            String stringBrackets = scanner.next();

            builder.append(Result.isBalanced(stringBrackets) + "\n");
        }

        System.out.print(builder.toString());

        scanner.close();
    }
}
