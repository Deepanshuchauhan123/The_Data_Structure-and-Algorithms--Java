/*
Time Complexity: O(n^2);
In both best and Wrost
*/
import java.util.*;

public class Selection_Sort{
        public static void main(String[] args) {

        int n;

        int array[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Count Of Inputs");
        n = sc.nextInt();

        System.out.println("Enter Total Numbers ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        selection_Sort(array, n);

    }

    public static void selection_Sort(int array[], int len) {
        int min;
        for (int i = 0; i < len-1; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {

                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if(i != min){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Array After Selection Sort: ");
        for (int k = 0; k < len; k++) {
            System.out.print(array[k] + " ");
        }
    }

}