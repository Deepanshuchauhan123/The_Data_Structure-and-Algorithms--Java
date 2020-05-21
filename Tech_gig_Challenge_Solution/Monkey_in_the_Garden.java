import java.util.Scanner;

class Monkey_in_the_Garden{

   public static void main(String arr[]) {

        int n;
        int array[] = new int[31];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(dist(array, n));
    }

    public static int dist(int array[], int n) {
        int max = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n / 2; i++) {

            for (int j = i + 1; j <= i + (n / 2); j++) {

                if ((array[i] + array[j] + j - i) > max) {
                    max = (array[i] + array[j] + j - i);
                }
            }

        }
        for (int i = 0; i < n; i++) {

            arr[i] = array[(n / 2 + i) % n];

        }

        for (int i = 0; i < n / 2; i++) {

            for (int j = i + 1; j <= i + (n / 2); j++) {

                if ((arr[i] + arr[j] + j - i) > max) {
                    max = (arr[i] + arr[j] + j - i);
                }
            }

        }
        return max;
    }
}