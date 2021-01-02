import java.util.*;
import java.io.*;

class Hash_Map{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            map.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(map.get(s)!=null){
                System.out.println(s+"="+map.get(s));
            }else{
                System.out.println("Not found");
            }
            
		}
	}
}