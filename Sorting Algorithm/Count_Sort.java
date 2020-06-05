/*
Drawback of Count Sort:
		The value of maximum element in the main array
		should be O(n).
		where n=size of array.
		So only applicable when elements in array are of small size.
		
		Not Use it for different values like 11, 111, 1111,5678,45670.

Worst complexity: n+r
Average complexity: n+r
Space complexity: n+r
Stable: Yes
Class: Non-comparison sort
Worst-case performance: where k is the range of the non-negative key values

This Program work Only For 0 and positive integers.
*/


import java.util.Scanner;

public class Count_Sort
{
    static Scanner sc=new Scanner(System.in);
    static int max,dumy_array[];
    public static void main(String[] args)
    {
        int array[],n;

        System.out.print("Enter Size Of Array:  ");
        n=sc.nextInt();
        array=new int[n];
        dumy_array=new int[n];
        System.out.print("\nEnter elements Of Array:  ");
        input_of_Array(n,array);

        count_Sort(n,array);

        System.out.print("\n After Count Sort :  ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }


    }
    public static void input_of_Array(int n, int array[])
    {
        max= array[0];

        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            if(max<array[i])
            {
                max=array[i];
            }
        }
    }

    public static void count_Sort(int n,int array[]){

        int count_array[]=new int[max+1];
        // For initialise whole array with initial value as zero rather than any garbage value
        for(int i=0;i<=max;i++)
        {
            count_array[i]=0;
        }
        // For adding value of how many times repeatation of element in main array
        for(int i=0;i<n;i++){
             ++count_array[array[i]];
        }
        // sum up with previous value
        for(int i=1;i<=max;i++)
        {
            count_array[i] +=count_array[i-1];
        }

        for(int i=n-1;i>=0;i--)
        {
            dumy_array[--count_array[array[i]]]=array[i];
        }
        for(int i=0;i<n;i++)
        {
            array[i]=dumy_array[i];
        }
    }
}