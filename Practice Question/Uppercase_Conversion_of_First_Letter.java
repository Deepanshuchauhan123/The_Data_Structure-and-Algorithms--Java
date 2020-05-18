import java.util.Scanner;

class Uppercase_Conversion_of_First_Letter{


    public static void main(String ar[]) {
       
String s1;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter lower case String:");
   s1=sc.nextLine();
   System.out.print(casech(s1));


   }

   public static String casech(String s1){
      char s2;
      s2=s1.charAt(0);
      s2=(char) (s2-32);
      return s2+s1.substring(1,s1.length());
   } 
}