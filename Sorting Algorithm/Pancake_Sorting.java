/*
Worst complexity:		 n
Average complexity: 		n
Space complexity: 		log(n)
Stable: 			No
Class:			Comparison sort
*/

import java.util.*;

public class Pancake_Sorting{
    static int array[];

    public static void main(String[] args) {
        int n;
        System.out.println("Enter size of array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        pancake_Sort(n);
        System.out.print("\nElements of array After PanCake Sorting : ");
        print_Sorted(n);

    }

    public static void pancake_Sort(int n) {
        int max;
        for (int i = n - 1; i >= 1; i--) {
            max = max_Finder(i);
            if (max != i) {
                swapper(max);
                swapper(i);
            }

        }
    }

    // This function will swap values
    public static void swapper(int value) {

        int start = 0;
        while (start < value) {
            int temp = array[value];
            array[value] = array[start];
            array[start] = temp;
            start++;
            value--;
        }
    }

    // This function will find maximum value in sub array
    public static int max_Finder(int current_Size) {
        int max_Index = 0;
        for (int i = 0; i <= current_Size; i++) {
            if (array[i] > array[max_Index]) {
                max_Index = i;
            }
        }
        return max_Index;
    }

    // This function will print array
    public static void print_Sorted(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

}