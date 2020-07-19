/*
Shell Sort::

Shell sort is the generalization of insertion sort which overcomes 
the drawbacks of insertion sort by comparing elements separated
by a gap of several positions.

Complexity	Best Case	Average Case	Worst Case
Time Complexity	Ω(n log(n))	θ(n log(n)2)	O(n log(n)2)

Space Complexity					O(1)

*/




import java.util.Scanner;

public class Shell_Sort
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

        shellSort(array, size);

        System.out.println("\nAfter Shell Sort: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void shellSort(int array[], int size)
    {

        //This loop goes on dividing the value by 2

        for (int i = size / 2; i > 0; i /= 2)
        {

            //This loop take from i th position to the last of the loop
            for (int j = i; j < size; j++)
            {

                //This loop is for comparision and back of the list
                for (int k = j - i; k >= 0; k = k - i)
                {
                    //If value greater than previous one then break the loop and choose next value
                    if (array[k + i] > array[k])
                    {
                        break;
                    } else
                        {
                        int temp = array[k + i];
                        array[k + i] = array[k];
                        array[k] = temp;
                        }
                }
            }
        }

    }

}