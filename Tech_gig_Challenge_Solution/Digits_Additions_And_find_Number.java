import java.io.*;
import java.util.*;
class Digits_Additions_And_find_Number{
    public static void main(String args[] ) throws Exception {

       	int odd=0,even=0,n,m,result1=0,result2=0,result;
        

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
       

            for(int i=n;i>0;i=i/10){
           result1=result1+i%10;
        }

          for(int i=m;i>0;i=i/10){
           result2=result2+i%10;
        }
      
        result=result1-result2;
        if(result1 == result2){
            System.out.print("Equal");
        }else
        if(result<0){
            System.out.print(m);
        } else{
            System.out.print(n);
        }
        
 

   }
}