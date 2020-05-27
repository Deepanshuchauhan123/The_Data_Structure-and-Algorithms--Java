import java.io.*;
import java.util.*;
class Static_Alphabet_Rectangle_Pattern{
    public static void main(String args[] ) throws Exception {

         int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int j=1;j<=n;j++ ){
            for(char i=65;i<65+5;i++){
                System.out.print(i);
                if(i!=65+5-1){
                    System.out.print(" ");
                }
            }
            if(j!=n){
                System.out.println("");
            }
        }

   }
}