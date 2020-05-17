import java.util.Scanner;

class Transpose_Matrix{
  public static void main(String ar[]) {

        int row1, col1,i,j;
        int matrix1[][] = new int[100][100];
        int matrix2[][] = new int[100][100];
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Rows and Columns:");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
	System.out.print("Enter "+row1+"X"+col1+ " Matrix");
        for ( i = 0; i < row1; i++) {
            for ( j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        for ( i = 0; i < row1; i++) {
            for ( j = 0; j < col1; j++) {
                matrix2[j][i] = matrix1[i][j];

            }

        }
	System.out.println("Transpose of Matrix: ");
        for ( i = 0; i < col1; i++) {
            for ( j = 0; j < row1; j++) {

                System.out.print(matrix2[i][j]);
                if (i != (col1  ) && j!=(row1-1)) {
                    System.out.print(" ");
                }
            }

            if (i!= (col1 -1 ) && j != (row1-1 )) {
                System.out.print("\n");
            }
            
        }
      
    }
}