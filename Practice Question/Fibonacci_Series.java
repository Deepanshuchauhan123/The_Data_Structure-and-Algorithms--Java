import java.util.*;

public class Fibonacci_Series
{
    public static void main(String[] args) 
    {
        int sum = 0, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacci Series Last Range");
        int count = sc.nextInt();

        System.out.println("Fibonacci series is :");
        for (int i = 0; i < count; i++) {

            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}