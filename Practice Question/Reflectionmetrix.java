import java.util.Scanner;
public class Reflectionmetrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	int i,j;
	char [][]data = new char[100][100];
	char temp;
	
	for (i=1;i<=5;i++)
	{
		for (j=1;j<= 5;j++)
		{
		data[i][j] = sc.next().charAt(0);	
		}
		
	}
	for (i=1;i<=5;i++)
	{
		for (j=1;j<= 2;j++)
		{
			temp=data[i][j];
			data[i][j]=data[i][6-j];
			data[i][6-j]=temp;
		}
	}
	for (i=1;i<=5;i++)
	{
		for (j=1;j<= 5;j++)
		{
			System.out.print(data[i][j]);
		}
		System.out.println("");
	}
}
}