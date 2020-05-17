import java.util.Scanner;

class Addition_Matrix{
 public static void main(String ar[]) {

        int row1, row2, col1, col2;

        int matrix1[][] = new int[100][100];
        int matrix2[][] = new int[100][100];
        int matrix3[][] = new int[100][100];

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows and column of Matrix 1 :");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        System.out.println("Enter Matrix 1 :");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of rows and column of Matrix 2 :");
        row2 = sc.nextInt();
        col2 = sc.nextInt();

        System.out.println("Enter Matrix 2 :");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition MAtrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j]);
                if (j != (col1 - 1)) {
                    System.out.print(" ");
                }
            }
            if (i != (col1 - 1) && i != (row1 - 1)) {
                System.out.print("\n");
            }
        }
        

    }
}
