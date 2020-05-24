import java.io.*;
import java.util.*;

interface Multiple{
    boolean isMultiple(int num);
}
class Multiple_Of_Three_Using_Lambda{
    public static void main(String args[] ) throws Exception {

         int n;
        Multiple p1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
          p1=(num)->{
             
       if(num %3 == 0){
           return true;
       }else{
 return false;
       }
      
        };
        for(int i=0;i<n;i++){
            if(p1.isMultiple(sc.nextInt())){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
      
    }
  
}