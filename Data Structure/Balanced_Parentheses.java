import java.util.*;

public class Balanced_Parentheses{

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        Paranthesis_Checker(s);

    }

    public static void Paranthesis_Checker(String s) {
        int top = -1, test = 0;
        char array[] = new char[100];
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                array[++top] = s.charAt(i);
                test = 1;
            }


            if (s.charAt(i) == ')') {
                if (top == -1) {
                    top = 0;
                    break;
                } else if (array[top] == '(') {
                    top--;
                } else {
                    top = 0;
                    break;
                }
            } else if (s.charAt(i) == '}') {
                if (top == -1) {
                    top = 0;
                    break;
                } else if (array[top] == '{') {
                    top--;
                } else {
                    top = 0;
                    break;
                }
            } else if (s.charAt(i) == ']') {
                if (top == -1) {
                    top = 0;
                    break;
                } else if (array[top] == '[') {
                    top--;
                } else {
                    top = 0;
                    break;
                }
            }

        }
        if (top == -1) {
            System.out.println(1);
        } else
            System.out.println(0);
    }

}