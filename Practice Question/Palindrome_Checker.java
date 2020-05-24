import java.util.*;

class Palindrome_Checker{

    public static void main(String arr[]) {
   
    	int n;

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(ispalindrome(sc.nextInt())){
                System.out.println("PALINDROME");
            }else{
                System.out.println("NOT PALINDROME");
            }
        }

   }


   public static boolean ispalindrome(int num){
       int ulta=0,test;
       test=num;

       while(num!=0){
           ulta=(ulta*10)+(num % 10);
           num=num/10;
       }
       if(test == ulta){
           return true;
       }

       return false;
   } 
}