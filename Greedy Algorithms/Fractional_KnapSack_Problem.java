/*
Fractional KnapSack Problem ::
	Knapsack Means a bag in which we have to carry products with maximum
	Profit.
Algorithm::
	Step 1: Compute profit bt weight ratio
	Step 2: Sort them by profit by weight Ratio.
	Step 3: Then enter those products having maximum profit by weight ratio.
	Step 4: If space remaining in knapsack then add fractional part of product.
	Step 5 : Now add all profit .

	Note : Knapsack limit should not be crossed.
*/

import java.util.Scanner;

public class Fractional_KnapSack_Problem
{
    static int profit[], weights[], dump_profit[] = new int[20], dumy_weight[] = new int[20], knapsack_size, z;

    static double pbyw[], dumy_array[] = new double[20], net_profit = 0.0;


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Objects : ");
        int objects = sc.nextInt();

        profit = new int[objects];
        weights = new int[objects];
        pbyw = new double[objects];

        for (int i = 0; i < objects; i++)
        {

            System.out.print("\nEnter Weight and Profit of Object " + (i + 1) + " : ");
            weights[i] = sc.nextInt();
            profit[i] = sc.nextInt();

            //calculating Profit by weight ration
            pbyw[i] = (double) profit[i] / weights[i];

        }

        //Input Knapsack Size
        System.out.print("\nEnter Knapsack Size : ");
        knapsack_size = sc.nextInt();


        // Sorting according to Profit/Weight ratio
        merge_sort(0, objects - 1);


        System.out.println("\nAfter Sorting by Profit/Weight ratio");
        for (int i = objects - 1; i >= 0; i--)
        {
            System.out.println("Weight : " + weights[i] + "   profit : " + profit[i] + " profit by weight : " + pbyw[i]);
        }

        // Now Calculating profit
        for (z = objects - 1; z >= 0; z--)
        {
            if (knapsack_size > 0 && knapsack_size >= weights[z])
            {
                knapsack_size = knapsack_size - weights[z];
                net_profit = net_profit + profit[z];

            } else
                {
                break;
                }
        }


        //Fraction part calculation for knapsack
        if (knapsack_size > 0)
        {

            net_profit = net_profit + ((double) profit[z] * (double) knapsack_size / weights[z]);
        }

        //Net profit using greedy approach
        System.out.println("Net Profit Using Greedy Approach is : " + net_profit);


    }

    //sorting array using merge sort for minimum time complexity O(nlogn)
    public static void merge_sort(int lower_Bound, int upper_Bound)
    {
        if (lower_Bound < upper_Bound)
        {
            int mid = (lower_Bound + upper_Bound) / 2;

            merge_sort(lower_Bound, mid);
            merge_sort(mid + 1, upper_Bound);

            //calling merge function to merge two parts
            Merge(lower_Bound, mid, upper_Bound);

        }
    }

    public static void Merge(int lower_Bound, int mid, int upper_Bound)
    {

        int loop1 = lower_Bound, loop2 = mid + 1, count = lower_Bound;

        while (loop1 <= mid && loop2 <= upper_Bound)
        {
            if (pbyw[loop1] < pbyw[loop2])
            {
                //sorting all according to profit by weight ratio
                dumy_array[count] = pbyw[loop1];
                dumy_weight[count] = weights[loop1];
                dump_profit[count] = profit[loop1];
                loop1++;

            } else
                {

                dumy_array[count] = pbyw[loop2];
                dumy_weight[count] = weights[loop2];
                dump_profit[count] = profit[loop2];
                loop2++;

                }
            count++;
        }

        if (loop1 > mid)
        {
            while (loop2 <= upper_Bound)
            {
                
                dumy_array[count] = pbyw[loop2];
                dumy_weight[count] = weights[loop2];
                dump_profit[count] = profit[loop2];
                count++;
                loop2++;
                
            }
        } else 
            {
                while (loop1 <= mid) 
                {
                    dumy_array[count] = pbyw[loop1];
                    dumy_weight[count] = weights[loop1];
                    dump_profit[count] = profit[loop1];
                    loop1++;
                    count++;
                    
                }
            }

        //Enter them back to original array
        for (int k = lower_Bound; k <= upper_Bound; k++) 
        {
            
            pbyw[k] = dumy_array[k];
            profit[k] = dump_profit[k];
            weights[k] = dumy_weight[k];
            
        }

    }
    
}

