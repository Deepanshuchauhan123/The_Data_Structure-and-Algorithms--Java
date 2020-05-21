import java.util.*;

class Array_part_where_need_sorting{

    public static void main(String args[]) throws Exception {
        
         int n, start = 0, end = 0, test = 0, test2 = 0;
        int array[] = new int[10000];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[i + 1]) {
                    start = i;
                } else if (array[i] < array[j]) {

                } else {
                    start = i;
                    test = 1;
                    break;
                }
            }
            if (test == 1) {
                break;
            }
        }

        end = n;

        for (int i = n - 1; i > 0; i--) {

            for (int j = i - 1; j >= 0; j--) {

                if (array[i] == array[i - 1]) {

                    end = i;
                } else if (array[i] <= array[j]) {

                    end = i;
                    test2 = 1;
                    break;
                }
            }
            if (test2 == 1) {
                break;
            }
        }

        for (int k = start; k <= end; k++) {
            System.out.print(array[k] + " ");
        }

    }
}
