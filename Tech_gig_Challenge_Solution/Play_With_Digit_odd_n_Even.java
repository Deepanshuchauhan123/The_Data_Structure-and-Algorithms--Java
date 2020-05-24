import java.io.*;
import java.util.*;
class Play_With_Digit_odd_n_Even{
    public static void main(String args[] ) throws Exception {

    
    	int odd=0,even=0,n,result,num;
        

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      

            for(int i=n;i>0;i=i/10){
                num=i%10;
            if(num %2 == 0){
                even=even+num;
            }else{
                odd=odd+num;
            }
        }
        result=even-odd;
        if(result<0){
            result=-result;
        } 
        System.out.print(result);
 

   }
}