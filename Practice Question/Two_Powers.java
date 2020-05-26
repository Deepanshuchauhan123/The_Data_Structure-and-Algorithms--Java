/*
Write a function that, for a given number n, finds a number p 
which is greater than or equal to n and is a power of 2.
*/
import java.io.*;
import java.util.*;
class Two_Powers{
    public static void main(String args[] ) throws Exception {

    		  	int a,x=1,y;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
      
      for(int i=1;i<a;i++){
          x=x*2;
          if(x>=a){
              break;
          }
      }
      
            System.out.print(x);
    

   }
}