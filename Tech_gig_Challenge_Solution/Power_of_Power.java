import java.io.*;
import java.util.*;
class Power_of_Power{
    public static void main(String args[] ) throws Exception {

    			  	int a,pow=1,test=0;
                     
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
       
      
      for(int i=1;i<a;i++){
          pow=pow*2;
          if(pow==a){
              System.out.print(1);
              test=1;
              break;
          }else if(pow>a){
              
              break;
          }
         
      }
     if(test==0){
         System.out.print(0);
     }

   }
}