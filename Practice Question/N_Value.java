/*
Nth Value :
The teacher has given Mehar a series and she has to tell the nth term of series. The series is 3, 8, 15, 24, 35, â€¦... She has to go to a party and needs favour from you. Can you tell her the nth term.
Input Format:
The first line of input consist of the number of test cases, T.

Next T lines consist of the integer, n.
*/

import java.io.*;
import java.util.*;
public class N_Value{
    public static void main(String args[] ) throws Exception {

    	int n,num;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            num=sc.nextInt();
          int result=0;  
          for(int j=1;j<=num;j++){
              result+=(2*j+1);
          }  
          System.out.println(result);      
        }

   }
}