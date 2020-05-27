import java.io.*;
import java.util.*;
public class Problem_31{
    public static void main(String args[] ) throws Exception {

    		  int n=0,z,y;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    z=n;
    for(int i=0;i<n;i++){
      z=n-i; 
      y=1;
        for(int j=0;j<n;j++){
            
            if(z<n){
                System.out.print(" ");
            }else{
                System.out.print(y++);
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