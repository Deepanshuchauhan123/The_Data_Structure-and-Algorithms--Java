import java.util.Scanner;

public class String_Palindrome
{
    public static void main(String args[]) throws Exception 
    {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] array = s1.toCharArray();
        int len = array.length, flag = 0;

        for (int i = 0, j = len - 1; i <= j; i++, j--) 
        {
            if (array[i] != array[j]) 
            {
                flag = 1;
                System.out.print("Not a Palindrome");
                break;
            }
        }
        if (flag == 0) 
        {
            System.out.print("Palindrome");
        }
    }
}