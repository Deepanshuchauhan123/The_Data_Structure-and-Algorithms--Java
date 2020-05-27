import java.io.*;
import java.util.*;
class Right_Angled_Numerical_Pattern{
    public static void main(String args[] ) throws Exception {

    int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(i);
                if( j!=n){
                    System.out.print(" ");
                }
            }
            if(i!=n){
                System.out.println("");
            }
        }

   }
}