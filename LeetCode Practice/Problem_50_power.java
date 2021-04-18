import java.util.Scanner;

class Problem_50_power{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            long power;
            double base;
            System.out.println("Enter Base = ");
            base = sc.nextDouble();
            System.out.println("Enter power = ");
            power = sc.nextLong();
            System.out.println(power_calculation(base, power));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static double power_calculation(double x, long n) {
        double value = 1;
        boolean negative = false;
        if (n < 0) {
            negative = true;
            n = -n;
        }
        while (n > 0) {
            if (n % 2 == 0) {
                x = x * x;
                n /= 2;
            } else {
                value = value * x;
                n--;
            }
        }
        if (negative)
            value = 1 / value;
        return value;
    }
}