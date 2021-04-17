import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FizzBuzz {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n;
            System.out.println("Enter number = ");
            n = sc.nextInt();

            List list = fizzbuzz(n);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    static List fizzbuzz(int n) {
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                list.add("FizzBuzz");
            else if (i % 3 == 0)
                list.add("Fizz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }
        return list;
    }
}