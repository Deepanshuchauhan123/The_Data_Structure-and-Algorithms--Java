import java.util.Scanner;

class Matching_Substring{
   public static void main(String arr[]){
        String s1,s2;
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter Main String: ");
        s1=sc.nextLine();
	System.out.println("Enter sub part of String: ");
        s2=sc.nextLine();
       System.out.println("No. of times repetation of sub String in main String : ");
        System.out.print(counts(s1,s2));
        
        
        
    }
        public static int counts(String s1,String s2){
            int count=0,rest;
          
               rest=s2.length()-1;
           
            for(int i=0;i<s1.length()-rest;i++){
               //System.out.println(s1.substring(i,i+s2.length())+" "+s2);
                if(s1.substring(i,i+s2.length()).equals(s2)){
                    count++; 
                }
            }
            return count;
        }
        
        
        
        }