import java.io.*;
import java.util.*;
class Problem_21{
    public static void main(String args[] ) throws Exception {

    		  int n=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(n-j);
            if(j!=n-i-1){
                System.out.print(" ");
            }
        }
        if(i!=n-1){
                System.out.println("");
            }
    }

   }
}