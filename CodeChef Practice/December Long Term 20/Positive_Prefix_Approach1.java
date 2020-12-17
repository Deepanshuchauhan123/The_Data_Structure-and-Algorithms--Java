import java.util.Scanner;

public class Positive_Prefix_Approach1{

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int testCase;
        testCase = sc.nextInt();
        while (testCase-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int array[] = new int[1001];
            for (int i = 0; i < n; i++)
                array[i] = i + 1;


            if (n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if (array[i] % 2 == 1) {
                        array[i] = -array[i];
                    }
                }
            } else if (n % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    if (array[i] % 2 == 0) {
                        array[i] = -array[i];
                    }
                }
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > 0) {
                    cnt++;
                }
            }
            if (k > cnt) {
                int diff = k - cnt;
                for (int i = n - 1; i >= 0; --i) {
                    if (diff > 0 && array[i] < 0) {
                        array[i] = -(array[i]);
                        diff--;
                    }
                }
            } else if (cnt > k) {
                int diff = cnt - k;
                for (int i = n - 1; i >= 0; --i) {
                    if (diff > 0 && array[i] > 0) {
                        array[i] = -array[i];
                        diff--;
                    }
                }
            }
            for (int i = 0; i < n; i++)
                System.out.print(array[i] + " ");

            System.out.println("");

        }
    }
}
