import java.io.*;
import java.util.*;
class Descending_Alphabetical_Rectangle{
    public static void main(String args[] ) throws Exception {

    int n=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for(int i=0;i<n;i++){
        for(char j=(char)(64+5);j>=65;j--){
            System.out.print(j);
            if(j!=65){
                System.out.print(" ");
            }
        }
        if(i!=n-1){
                System.out.println("");
            }
    }

   }
}