import java.io.*;
import java.util.*;
class Asterisk_right_angle_Triangle{
    public static void main(String args[] ) throws Exception {

    	int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=n-1;i>=0;i--){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
                if(j!=1){
                    System.out.print(" ");
                }
            }
            if(i!=0){
                System.out.println("");
            }
        }

   }
}