import java.io.*;
import java.util.*;
class Pattern_Problem_07{
    public static void main(String args[] ) throws Exception {

    	int n;

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++ ){
            for(int j=5;j>0;j--){
                System.out.print(j);
                if(j!=1){
                    System.out.print(" ");
                }
            }
            if(i!=n-1){
                    System.out.println("");
                }
        }

   }
}