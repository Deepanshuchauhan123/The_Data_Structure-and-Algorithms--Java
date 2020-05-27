import java.io.*;
import java.util.*;
class Ascending_Numerical_Right_Angle_Triangle{
    public static void main(String args[] ) throws Exception {

    int n=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
            if(j!=i){
                System.out.print(" ");
            }
        }
        if(i!=n){
                System.out.println("");
            }
    }

   }
}