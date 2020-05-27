import java.io.*;
import java.util.*;
class Numerical_Right_Angle_Triangle{
    public static void main(String args[] ) throws Exception {

    	int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=n-1;i>=0;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(n-i);
                if(j!=1){
                    System.out.print(" ");
                }
            }
            if(i!=0){
                System.out.println("");
            }
        }

   }
}