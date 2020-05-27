import java.io.*;
import java.util.*;
class Rectangular_Numerical_Pattern{
    public static void main(String args[] ) throws Exception {

    	int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<6;j++){
                System.out.print(i);
                if( j!=5){
                    System.out.print(" ");
                }
            }
            if(i!=n){
                System.out.println("");
            }
        }

   }
}