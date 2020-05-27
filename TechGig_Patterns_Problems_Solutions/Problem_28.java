import java.io.*;
import java.util.*;
public class Problem_28{
    public static void main(String args[] ) throws Exception {

    		     int n=0,z;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for(int i=1;i<=n;i++){
        z=1;
        for(int j=0;j<n;j++){
            if(j<n-i){
                System.out.print(" ");
            }else{
                System.out.print((char)(64+z++));
            }
          
            if(j!=n-1){
                System.out.print(" ");
            }
        }
        if(i!=n){
                System.out.println("");
            }
    }

   }
}