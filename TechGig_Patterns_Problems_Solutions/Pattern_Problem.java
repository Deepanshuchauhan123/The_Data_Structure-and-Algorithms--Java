import java.io.*;
import java.util.*;
class Pattern_Problem{
    public static void main(String args[] ) throws Exception {

    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for( int j=n;j>0;j--){
        for(int i=1;i<=5;i++  ){
            System.out.print(j);
            if(i!=5){
                System.out.print(" ");
            }
        }
        if(j!=1){
            System.out.println("");
        }
    }

   }
}