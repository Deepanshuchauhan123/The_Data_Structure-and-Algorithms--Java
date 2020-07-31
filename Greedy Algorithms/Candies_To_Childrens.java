/*
Candies To Children :: 
There are N children standing in a line. Each child is assigned a rating value.
You are giving candies to these children subjected to the following requirements:

-> Each child must have at least one candy.
-> Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

*/

import java.util.Scanner;

public class Candies_To_Childrens
{
    public static void main(String[] args) 
    {

        int candies[], rating[], size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        candies = new int[size];
        rating = new int[size];

        // Initially Satisfying each child a candy	
        for (int i = 0; i < size; i++) 
        {
            rating[i] = sc.nextInt();
            candies[i] = 1;
        }

         //From Left Side compare 
        for (int i = 1; i < size; i++) 
        {

             //if left neighbour is having less value than right neighbour then increasing candies of the Right children
            if (rating[i] > rating[i - 1]) 
            {

	// left child candy + 1 candies will be assign to the right child
                candies[i] = candies[i - 1] + 1;
            }
        }

         // Now comparing From Right Side
        for (int i = size - 2; i >= 0; i--) 
        {

             //if Right neighbour is having less value than Left neighbour then increasing candies of the Left children 
            if (rating[i] > rating[i + 1]) 
            {
	// Checking if the candies after increasing are greater than pre assign candies if not then assign new candies
                if (candies[i] < candies[i + 1] + 1)
                    candies[i] = candies[i + 1] + 1;
            }
        }

        int sum = 0;

        // Sum up all the Candies and print the output
        for (int i = 0; i < size; i++) 
        {
            sum = sum + candies[i];
        }

        System.out.print(sum);
    }
}

