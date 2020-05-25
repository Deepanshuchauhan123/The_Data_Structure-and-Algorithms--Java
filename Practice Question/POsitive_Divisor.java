import java.io.*;
import java.util.*;
class POsitive_Divisor{
    public static void main(String args[] ) throws Exception {

    	int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.print(count-1);

   }
}