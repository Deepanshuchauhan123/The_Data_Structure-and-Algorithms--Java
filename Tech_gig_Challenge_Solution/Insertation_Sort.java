/*
Algorithmic Paradigm: Incremental Approach
Uses: Insertion sort is used when number of elements is small. 
          It can also be useful when input array is almost sorted,
          only few elements are misplaced in complete big array.
*/

import java.util.*;

public class Insertation_Sort{

    public static void main(String[] args) {

        int n;

        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Numbers: ");
        n = sc.nextInt();
        System.out.println("Enter Numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }

        Insertation_Sort(array, n);
        System.out.println("After Insertation Sort: ");
        for (int k = 0; k < n; k++) {
            System.out.print(array[k] + " ");
        }
    }

    public static void Insertation_Sort(int array[], int len) {
        int temp, i, j;
        for (i = 1; i < len; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }


    }
}