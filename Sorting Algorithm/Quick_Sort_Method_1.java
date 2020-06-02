/*
When Pivot element is starting elements.

Time Complexity:
 Average Case: O(n log n)
Wrost Case :O(N^2)
*/
import java.util.*;

public class Quick_Sort_Method_1{

    public static void main(String[] args) {


        int n;

        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }
/* Adding a very large number to the end so that array out of index error doesnot occur */ 
        array[n]=100000;

        Quick_Sort(array, 0, n-1);
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
        int temp,test;
        int pivot = array[lowerbound];
        int start = lowerbound;
        int end = upperbound;

        while (start < end) {

            while (array[start] <= pivot) {
                start++;
            }
            while ((array[end] > pivot)) {
                end--;
            }

            if (start < end) {
                 temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
         test=array[end];
        array[end]=array[lowerbound];
        array[lowerbound]=test;

        return end;
    }

}