import java.io.*;
import java.util.*;
public class Problem_39{
    public static void main(String args[] ) throws Exception {

    		   int n,z,w;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    z=n;
    for(int i=0;i<n;i++){
        z=1;
        w=1;
        for(int j=0;j<n;j++){
            if(z<n-i){
                System.out.print(" ");
            }else{
                System.out.print(w);
                w++;
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
                System.out.print(w);
                w++;           
            
        }
        if(i!=n-1)
        System.out.println("");
    }

   }
}