/*
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this-
             A
          B A B
       C B A B C
   D C B A B C D
E D C B A B C D E 
*/

import java.io.*;
import java.util.*;
public class Problem_44{
    public static void main(String args[] ) throws Exception {

    	
    int n,z,w=1,o;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    z=n;
    for(int i=0;i<n;i++){
        z=1;
         w=1;
         o=i;
        for(int j=0;j<n;j++){
            if(z<n-i){
                System.out.print(" ");
            }else
            {
                System.out.print((char)(65+o--));
                 if(i==0 && n!=1){
                System.out.print(" ");
            }
            }           
            if(j!=n-1 ){
                System.out.print(" ");
            }
            z++;
        }
        for(int k=0;k<i;k++){
           
            if(k!=i){
                System.out.print(" ");
            }
                System.out.print((char)(65+w++));         
        }
        if(i!=n-1)
        System.out.println("");
    }

   }
}