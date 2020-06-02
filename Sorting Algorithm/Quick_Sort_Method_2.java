/*
When Pivot element is Last elements.

Time Complexity:
 Average Case: O(n log n)
Wrost Case :O(N^2)
*/
import java.util.*;

public class Quick_Sort_Method_2{

    public static void main(String[] args) {


        int n;

        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }


        Quick_Sort(array, 0, n - 1);
        System.out.println("After Quick Sort: ");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }


    public static void Quick_Sort(int array[], int lowerbound, int upperbound) {

        if (lowerbound < upperbound) {
            int loc = partation(array, lowerbound, upperbound);
            Quick_Sort(array, lowerbound, loc - 1);
            Quick_Sort(array, loc + 1, upperbound);
        }

    }

    public static int partation(int array[], int lowerbound, int upperbound) {
        int temp;
        int pivot = array[upperbound];
        int start = lowerbound - 1;

        for (int j = lowerbound; j < upperbound; j++) {
            if (array[j] <= pivot) {

                start++;
                temp = array[j];
                array[j] = array[start];
                array[start] = temp;

            }

        }

        temp = array[upperbound];
        array[upperbound] = array[start+1];
        array[start+1] = temp;

        return start+1;

    }

}