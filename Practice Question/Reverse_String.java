import java.io.*;
import java.util.*;
class Reverse_String{
    public static void main(String args[] ) throws Exception {

    	String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }

   }
}