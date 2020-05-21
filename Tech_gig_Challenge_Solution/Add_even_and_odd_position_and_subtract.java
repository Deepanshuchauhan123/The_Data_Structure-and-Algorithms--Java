import java.io.*;
import java.util.*;
class Add_even_and_odd_position_and_subtract{
    public static void main(String args[] ) throws Exception {

    	int odd=0,even=0,n,result;
        int array[]=new int[1000];

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();     
           }

            for(int i=0;i<n;i++){
            if((i+1)%2==0){
                even=even+array[i];
            }else{
                odd=odd+array[i];
            }
        }
        result=even-odd;
        if(result<0){
            result=-result;
        } 
        System.out.print(result);
 

   }
}