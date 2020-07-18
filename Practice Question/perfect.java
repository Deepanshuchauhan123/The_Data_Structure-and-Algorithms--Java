class perfect
{
	public static void main(String ar[])
	{
	int n=27,count=0,z;
	z=n;	
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		count=count+i;
	}
	
	if(z==count)
	System.out.println("Perfect Number");
	else
	System.out.println("Not a Perfect Number");
	}
}	
	
	