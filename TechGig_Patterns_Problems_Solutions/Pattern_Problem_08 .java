import java.io.*;
import java.util.*;
class Pattern_Problem_08 {
    public static void main(String args[] ) throws Exception {

    int n=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for( char i=(char)(65+n-1);i>=65;i--){
        for( int j=5;j>0;j--  ){
            System.out.print(i);
            if(j!=1){
                System.out.print(" ");
            }
        }
        if(i!=65){
            System.out.println("");
        }
    }

   }
}