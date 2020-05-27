import java.io.*;
import java.util.*;
public class Problem_30{
    public static void main(String args[] ) throws Exception {

    	
    	  int n=0,z;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    z=n;
    for(int i=0;i<n;i++){
      z=n-i; 
        for(int j=0;j<n;j++){
            
            if(z<n){
                System.out.print(" ");
            }else{
                System.out.print(n-i);
            }          
            if(j!=n-1){
                System.out.print(" ");
            }
            z++;
        }
        if(i!=n-1){
                System.out.println("");
            }
    }

   }
}