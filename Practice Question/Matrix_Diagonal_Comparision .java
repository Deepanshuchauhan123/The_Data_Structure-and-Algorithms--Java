import java.io.*;
import java.util.*;
class Matrix_Diagonal_Comparision {
    public static void main(String args[] ) throws Exception {

        	int r,c,d1=0,d2=0,max;
        int matrix[][]=new int[10][10];

        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
       

            for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              matrix[i][j]=sc.nextInt();
        }
        }
            max=c-1;
            for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
             if(i==j){
                 d1=d1+matrix[i][j];
             }
             if(max==j){
                 d2=d2+matrix[i][j];
                 max--;
             }
        }
        }
          if(d1 ==d2){
               System.out.print("Equal");
          }else{
              if(d1<d2){
                  System.out.print("Diagonal 2");
              }else{
                  System.out.print("Diagonal 1");
              }
          }
       
        
 

   }
}