import java.util.*;

class First_Repeating_number{

    public static void main(String arr[]) {

        int n, test = 0;
        int array[] = new int[1000];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i]);
                    test = 1;
                    break;
                }

            }
            if (test == 1) {
                break;
            }
        }

    }
}