import java.util.Scanner;
import java.util.Stack;

class Problem20_ValidParenthesis{

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        if (isValid(value))
            System.out.println("Valid Parentheses");
        else
            System.out.println("Invalid Parenthese");

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else {
                char top = 'a';
                if (stack.isEmpty())
                    return false;
                else
                    top = stack.pop();

                if (top == '{' && s.charAt(i) != '}')
                    return false;
                if (top == '[' && s.charAt(i) != ']')
                    return false;
                if (top == '(' && s.charAt(i) != ')')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}