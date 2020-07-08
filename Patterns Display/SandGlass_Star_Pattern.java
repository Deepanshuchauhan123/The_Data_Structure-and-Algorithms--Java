/*
Enter Number of Rows 6

* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 

*/

import java.util.Scanner;

class SandGlass_Star_Pattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows ");
        int rows = sc.nextInt();


        for (int i = 0; i < rows-1; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k < rows; k++) 
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = rows-1; i >= 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 0; k < rows - i; k++) 
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}