/* To findout the maximum sum of increasing subsequence having maximum value */

import java.util.Scanner;

class Maximum_sum_increasing_subsequence{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int array[], dumy[], max, size = 0;

            System.out.println("Enter Number of elements");
            size = sc.nextInt();

            //initializing the arrays
            array = new int[size];
            dumy = new int[size];

            //taking input of elements and copying it into both arrays
            System.out.println("Enter " + size + " Elements ");
            for (int i = 0; i < size; i++)
                dumy[i] = array[i] = sc.nextInt();

            max = array[0];

            for (int i = 1; i < size; i++)
            {
                for (int j = 0; j < i; j++)
                {

                    if (array[i] > array[j] && array[i] + dumy[j] > dumy[i])
                    {
                        dumy[i] = array[i] + dumy[j];

                        if (max < dumy[i])
                            max = dumy[i];
                    }
                }
            }
            System.out.println("Maximum sum of increasing subsequence is " + max);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}