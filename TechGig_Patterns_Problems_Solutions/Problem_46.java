/*
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this-
            A
         A B A
      A B C A B
   A B C D A B C
A B C D E A B C D 
*/

import java.io.*;
import java.util.*;
class Problem_46{
    public static void main(String args[] ) throws Exception {

    
        int n,z,x,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(char i=0;i<n;i++){
            z=1+i;
            x=1;
            k=1;
            for(int j=0;j<n;j++){
                if(n>z){
                    System.out.print(" ");
                }else{
                    System.out.print((char)(x+64) );
                    x++;
                }
                z++;
                if(j!=n-1){
                    System.out.print(" ");
                }

            }
            for(int c=x-2;c>0;c--){
                if(c>0){
                    System.out.print(" ");
                }
                System.out.print((char)(c+64));

            }
          //  System.out.print("D");

            if(i!=n-1){
                System.out.println("");
            }


        }

   }
}