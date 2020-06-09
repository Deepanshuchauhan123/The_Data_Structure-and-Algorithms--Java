/*
Algorithm:		Merge Sort
Worst complexity: 		n*log(n)
Average complexity: 	n*log(n)
Best complexity: 		n*log(n)
Space complexity: 		n
Method: 			Merging(Divide n Conquer)
Stable: 			Yes
*/

import java.util.*;

public class Merge_Sort{
    static int array[];

    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter size of array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }
        merge_Sort(0, n - 1);
        System.out.print("\nElements of array After Merge Sorting : ");
        print_Sorted(n);

    }

    public static void merge_Sort(int lower_Bound, int upper_Bound) 
    {
        if (lower_Bound < upper_Bound) 
        {
            int mid = (lower_Bound + upper_Bound) / 2;

            merge_Sort(lower_Bound, mid);
            merge_Sort(mid + 1, upper_Bound);
            Merge(lower_Bound, mid, upper_Bound);
        }

    }

    public static void Merge(int lower_Bound, int mid, int upper_Bound) 
    {
        int dumy_array[] = new int[20];
        int loop1 = lower_Bound, loop2 = mid + 1, count = lower_Bound;

        while (loop1 <= mid && loop2 <= upper_Bound) 
        {
            if (array[loop1] < array[loop2]) 
            {
                dumy_array[count] = array[loop1];
                loop1++;
            } else 
                {
                dumy_array[count] = array[loop2];
                loop2++;
                }
            count++;
        }
        if (loop1 > mid) 
        {
            while (loop2 <= upper_Bound) 
            {
                dumy_array[count++] = array[loop2++];
            }
        } else 
            {
            while (loop1 <= mid)
            {
                dumy_array[count++] = array[loop1++];
            }
        }
        for (int k = lower_Bound; k <= upper_Bound; k++) 
        {
            array[k] = dumy_array[k];
        }
    }


    // This function will print array
    public static void print_Sorted(int n) 
    {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

}