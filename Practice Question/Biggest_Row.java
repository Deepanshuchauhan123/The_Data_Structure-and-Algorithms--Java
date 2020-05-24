import java.io.*;
import java.util.*;
class Biggest_Row{
    public static void main(String args[] ) throws Exception {

           int r, c, max = 0, row = 0, test = 0, great = 0;
        int matrix[][] = new int[10][10];
        int s[] = new int[100];

        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
            for (int i = 0; i < r; i++) {
for (int j = 0; j < c; j++) {
                max = max + matrix[i][j];
            }
            if (i == 0) {
                s[0] = max;
                great = max;
            } else {
                if (max > great) {
                    great=max;
                    row = i;
                }
                s[i] = max;
            }
             //  System.out.println("great  "+great);
            // System.out.println("max "+max+"   s value "+s[j]);
            max = 0;

        }
        for (int i = 0; i <r; i++) {
            if (s[i] == great) {

            } else {
                System.out.print("Row " + (row+1));
                test = 1;
                break;
            }
        }

        if (test == 0) {
            System.out.print("Equal");
        }

    }
}