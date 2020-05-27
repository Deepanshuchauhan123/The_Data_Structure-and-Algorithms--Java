import java.io.*;
import java.util.*;
class Ascending_Alphabetical_Right_angled_Triangle{
    public static void main(String args[] ) throws Exception {

    	
    int n=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for(int i=0;i<n;i++){
        for(char j=(char)65;j<=i+65;j++){
            System.out.print(j);
            if(j!=i+65){
                System.out.print(" ");
            }
        }
        if(i!=n-1){
                System.out.println("");
            }
    }

   }
}