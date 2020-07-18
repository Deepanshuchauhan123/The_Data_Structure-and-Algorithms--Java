import java.util.Scanner;
/*class person
{
	public String name,address;
	person()
	{
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
	//Scanner sc1=new Scanner(System.in);
	//address=sc1.nextLine();
	}
}*/
class students
{
	public int age;
	Scanner s1=new Scanner(System.in);
	students()
	{
	//Scanner s1=new Scanner(System.in);
	//age=s1.nextInt();
	//System.out.println(name);
	//System.out.println(address);
	System.out.println(age);
	}
	void input()
	{
		age=s1.nextInt();
		//System.out.println(name);
		//System.out.println(address);
		System.out.println(age);
	}
	public static void main(String ar[])
	{
		//person p1=new person();
		students s102=new students();
		s102.input();
	}
}
