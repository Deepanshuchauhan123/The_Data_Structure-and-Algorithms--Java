import java.util.Scanner;
public class javabasiccalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
	String s1=input;
	double output = 0;
	String[] tokens=input.split("\\+|\\-|\\*|\\/");
	for(int i =0;i<input.length();i++)
    {
     	   if(input.charAt(i) =='+')
             output= Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
     
      else if(input.charAt(i) =='-')
    		 output= Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[1]); 
     
      else if(input.charAt(i) =='*')
       		 output= Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[1]);

      else if(input.charAt(i) =='/')
      		 output= Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[1]);
    }
        System.out.print(s1 + " = "+ Math.round(output));
 }
}