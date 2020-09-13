import java.util.Scanner;

public class Diagonal_Order_Matrix
{
    public static void main(String[] args) 
    {

        int row, col, array[][], flag1 = 0, flag2 = 0, test = 0;

        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();
        array = new int[row][col];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++)
        {
            flag1 = i;
            for (int j = 0; j < col && j <= i; j++)
            {

                System.out.print(array[flag1--][j] +" ");
            }
            System.out.println("");


        }

        for (int i = 0; i < col - 2; i++)
        {
            flag2 = row - 1;
            test = col - i - 1;
            for (int j = 1; j <= col - 1 && flag2 != -1 && test > 0; j++, test--)
            {

                System.out.print(array[flag2--][j + i] +" ");
            }
            System.out.println("");
        }

        if(col!=1)
        {
            System.out.print(array[row - 1][col - 1]);
        }


    }
}

