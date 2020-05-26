import java.io.*;
import java.util.*;
class Print_Even_Two_D_Matrix{
    public static void main(String args[] ) throws Exception {

    int row,col,count=0;
        int array[][]=new int[100][100];
        Scanner sc=new Scanner(System.in);
        
        row=sc.nextInt();
        col=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(array[i][j]%2==0){
                   count++;
                   if(count!=1){
                       System.out.print(" ");
                   }
                   System.out.print(array[i][j]);
               }
            }
        }
   }
}