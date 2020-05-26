import java.io.*;
import java.util.*;
class Addition_Of_Two_Matrix{
    public static void main(String args[] ) throws Exception {

    	
    int row,col,row2,col2;
        int array[][]=new int[100][100];
        int array2[][]=new int[100][100];
        int array3[][]=new int[100][100];
        Scanner sc=new Scanner(System.in);
        
        row=sc.nextInt();
        col=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        row2=sc.nextInt();
        col2=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               array3[i][j]=array[i][j]+array2[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j!=0){
                    System.out.print(" ");
                }
              System.out.print(array3[i][j]);

            }
            if(i!=row-1){
                System.out.print("\n");
            }
        }

   }
}