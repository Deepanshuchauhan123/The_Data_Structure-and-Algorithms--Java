import java.io.*;
import java.util.*;

public class String_Operation 
   {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       
        System.out.println(A.length()+B.length());
        int rev = A.compareTo(B);
            if(rev>1){
            System.out.println("Yes");
            }else if(rev<1){
                System.out.println("No");
            }
        

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "
                +B.substring(0,1).toUpperCase()+B.substring(1));
    }
}