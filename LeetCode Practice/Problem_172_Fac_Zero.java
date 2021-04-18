import java.util.Scanner;

class Problem_172_Fac_Zero {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n;
            System.out.println("Enter number = ");
            n = sc.nextInt();
            System.out.println(trailing_Zero(n));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static int trailing_Zero(int n) {
        int count=0;
        while(n>0)
        {
            n=n/5;
            count +=n;
        }

        return count;
    }
}