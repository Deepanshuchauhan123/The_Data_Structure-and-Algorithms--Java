import java.util.Scanner;

public class EvenPSum{

    public static void main(String[] args) throws java.lang.Exception {
        long testCase, set1, set2, even1, odd1, even2, odd2;

        Scanner sc = new Scanner(System.in);

        try {

            testCase = sc.nextInt();
            for (int i = 0; i < testCase; i++) {
                set1 = sc.nextInt();
                set2 = sc.nextInt();

                if (set1 % 2 == 0) {
                    even1 = set1 / 2;
                    odd1 = set1 / 2;
                } else {
                    even1 = set1 / 2;
                    odd1 = set1 / 2 + 1;
                }
                if (set2 % 2 == 0) {
                    even2 = set2 / 2;
                    odd2 = set2 / 2;
                } else {
                    even2 = set2 / 2;
                    odd2 = set2 / 2 + 1;
                }
                System.out.println(even1 * even2 + odd1 * odd2);
            }

        } catch (Exception e) {
            return;
        }
    }
}