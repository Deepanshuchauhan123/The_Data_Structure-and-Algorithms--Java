/*
COMB SORT ::
Comb Sort is the advance form of Bubble Sort. 
Bubble Sort compares all the adjacent values while comb sort removes all the turtle values or small values near the end of the list.

Algorithm	    		Complexity

Worst Case Complexity	O(n^2)
Best Case Complexity	θ(n log n)
*/

import java.util.Scanner;

public class Comb_Sort
{
    public static void main(String[] args) 
    {
        int size, array[];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array Size ");
        size = sc.nextInt();
        
        array = new int[size];
        
        
        System.out.print("Enter Unsorted Elements: ");
        for (int i = 0; i < size; i++) 
        {
            array[i] = sc.nextInt();
        }
        
        combSort(array, size);

        System.out.println("\nAfter Comb Sort: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void combSort(int array[], int size) 
    {

        int gap = size;
        
        while (gap != 1) 
        {
            gap = gap_calculating(gap);

            //Our sorting is start from 0 and goes to the size-gap of fixed gap 
            for (int i = 0; i < size - gap; i++) 
            {
                //If Out of Order then we swap the values
                if (array[i] > array[i + gap]) 
                {
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;
                }
            }
        }
    }

    //calculating gap and each time gap is divided by 1.3
    public static int gap_calculating(int gap) 
   {
        return (int) (gap / 1.3);
    }
}