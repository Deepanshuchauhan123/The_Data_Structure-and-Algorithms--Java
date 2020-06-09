
import java.util.Scanner;

public class Infix_To_PostFix_Expresson_Evaluation_using_Stack{
    static int top = -1, stack_top = -1, length;
    static String s;
    static char stack[] = new char[100];
    static char infix[] = new char[100];
    static char postfix[] = new char[100];

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();
        length = s.length();
        infix[0] = '(';
        for (int i = 0; i < length; i++) 
        {
            infix[i + 1] = s.charAt(i);
        }
        infix[length + 1] = ')';


        for (int i = 0; i <= length + 1; i++) 
        {

            if (infix[i] == '+' || infix[i] == '-' || infix[i] == '*' || infix[i] == '/' || infix[i] == '^') 
            {
                while (stack_top > -1 && order_Checker(infix[i]) <= order_Checker(stack[stack_top])) 
                {
                    postfix[++top] = stack[stack_top];
                    stack_top--;
                }
                stack[++stack_top] = infix[i];

            } else if (infix[i] == '(' || infix[i] == '{' || infix[i] == '[') 
            {
                stack[++stack_top] = infix[i];
            } else if (infix[i] == ')') 
            {
                while (stack_top > -1 && stack[stack_top] != '(') 
                {
                    postfix[++top] = stack[stack_top];
                    stack_top--;
                }
                stack_top--;
            } else if (infix[i] == '}') 
            {
                while (stack_top > -1 && stack[stack_top] != '{') 
                {
                    postfix[++top] = stack[stack_top];
                    stack_top--;
                }
                stack_top--;
            } 
            else 
                if (infix[i] == ']') 
                {
                while (stack_top > -1 && stack[stack_top] != '[') 
                {
                    postfix[++top] = stack[stack_top];
                    stack_top--;
                }
                stack_top--;
                 } else 
                 {
                  postfix[++top] = infix[i];
                 }


        }
        for (int z = 0; z <= top; z++) 
        {
            System.out.print(postfix[z]);
        }
    }

    public static int order_Checker(char ch) 
    {
        switch (ch) 
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}