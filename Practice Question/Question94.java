import java.util.Scanner;
public class Question94{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);    
    int i,j;
	   
		
	
	for (i=1;i<=5;i++)
	{ 
 char data[] = new char[6];
      
		for (j=1;j<= 5;j++){
		data[j]= sc.next().charAt(0);	
      }
  		    for(int k=5;k>0;k--){
    		  System.out.print(data[k]);
       		   }
      System.out.println("");
    }
}}