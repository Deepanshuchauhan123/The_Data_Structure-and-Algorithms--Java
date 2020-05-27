import java.io.*;
import java.util.*;
public class Problem_41{
    public static void main(String args[] ) throws Exception {

    	
    	     	   int n,z,p=0,v=1;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    z=n;
    for(int i=0;i<n;i++){
        z=1;
        v=1;
        
        for(int j=0;j<n;j++){
            if(z<n-i){
                System.out.print(" ");
            }else{
  System.out.print((char)(64+v));
  v++;
            }
          
            if(j!=n-1){
                System.out.print(" ");
            }
            z++;
        }
        for(int k=0;k<i;k++){
            if(k!=i){
                System.out.print(" ");
            }
                System.out.print((char)(64+v));
                v++;
            
            
        }
        if(i!=n-1)
        System.out.println("");
        p=p+1;
    }

   }
}