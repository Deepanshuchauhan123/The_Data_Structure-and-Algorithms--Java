/*
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this-
5 5 5 5 5 5 5 5 5
   4 4 4 4 4 4 4
      3 3 3 3 3
         2 2 2
            1 
*/

import java.io.*;
import java.util.*;
public class Problem_48{
    public static void main(String args[] ) throws Exception {

    	
    	    int n,z,x,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(char i=0;i<n;i++){
            z=n+i;
            x=n-i-1;
            k=1;
            for(int j=0;j<n;j++){
                if(z>n){
                    System.out.print(" ");
                }else{
                    System.out.print(n-i);
                    //x++;
                }
                z--;
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            for(int c=x;c>=1;c--){
                if(c>=1){
                    System.out.print(" ");
                }
                System.out.print(n-i);

            }
          //  System.out.print("D");

            if(i!=n-1){
                System.out.println("");
            }


        }

   }
}