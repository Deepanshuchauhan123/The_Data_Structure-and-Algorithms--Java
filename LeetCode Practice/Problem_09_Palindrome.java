import java.util.Scanner;

class Problem_09_Palindrome{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n;
            System.out.println("Enter number = ");
            n = sc.nextInt();
            System.out.println(palindrome(n));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static boolean palindrome(int n) {
        boolean is_palindrome=false;
        int reverse=0,num=n;

        while(num>0)
        {
            reverse = (reverse*10) + (num%10);
            num/=10;
        }
        if(reverse==n)
            return true;

        return is_palindrome;
    }
}