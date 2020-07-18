import java.util.*;
class abc 
{
	public static void main(String ar[])
	{
	int num=153,count=0,t=0,p,res=0,rest=0,z=0,r1;
	res=num;
	rest=res;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	num=sc.nextInt();
	while(num!=0)
	{
	t++;
	num=num/10;
	}
	p=t;

	while(t!=0)
	{
	r1=res%10;
	count=count+(int)Math.pow(r1,p);
	t--;
	res=res/10;
	}
	System.out.println(count);

	if(rest==count)
	System.out.println("Armstrong number");
	else
	System.out.println("Not a Armstrong number");
	}
}
	
	