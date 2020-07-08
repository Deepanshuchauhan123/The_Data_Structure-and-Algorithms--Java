/*
5

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*

*/

import java.util.Scanner;

class Arrow_head_Pattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows ");
        int rows = sc.nextInt();
        System.out.println("");

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}