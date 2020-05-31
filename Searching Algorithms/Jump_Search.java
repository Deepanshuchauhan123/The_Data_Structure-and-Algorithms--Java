/*
Time Complexity:
	O(√n2)
Optimal Size of Block = √n2
Better than Linear Search but Wrost than BinarySearch.
*/

import java.util.*;
import java.lang.Math;

public class Jump_Search{
    public static void main(String[] args) {

        int n, s, value;

        int array[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Count Of Inputs");
        n = sc.nextInt();

        System.out.println("Enter Total Numbers ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Element To be Searched: ");
        s = sc.nextInt();

        //Function Calling
        value = jumpSearch(s, array, n);

        if (value >= 0) {
            System.out.println("Element Found at " + (value + 1));

        } else
            {
            System.out.println("Element Not Found");
            }

    }

    public static int jumpSearch(int search, int array[], int len) {
        int left = 0;
        int right = (int) Math.sqrt(len);

        while (search >= array[right] && right < len)
        {
            left = right;
            right += Math.sqrt(len);
            if (right > len - 1)
            {
                right = len;
            }
        }
        for (int i = left; i < right; i++)
        {
            if (array[i] == search)
            {
                return i;
            }
        }

        return -1;
    }

}