/*
Insertation Sort:
		Worst complexity: n^2
		Average complexity: n^2
		Best complexity: n
		Space complexity: 1
		Method: Insertion
		Stable: Yes
		Class: Comparison sort
*/
import java.util.Scanner;

public class Insertation_Sort{


    static int array[];

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Elements ");
        n = sc.nextInt();

        System.out.println("Enter Unsorted Elements ");
        array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        insertationSort(array, n);
        print_Sorted(array,n);
    }

    public static void print_Sorted(int arrray[],int n)
    {
        System.out.print("After Insertation Sort ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void insertationSort(int array[], int n)
    {
        int temp, loc;
        for (int i = 1; i < n; i++)
        {
            temp = array[i];
            loc = 0;
            for (int j = i - 1; j >= 0; j--)
            {
                if (array[j] > temp)
                {
                    array[j + 1] = array[j];
                } else
                    {
                    loc = j + 1;
                    break;
                    }
            }
            array[loc] = temp;
        }

    }
}