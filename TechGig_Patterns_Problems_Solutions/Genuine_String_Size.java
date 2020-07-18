import java.util.ArrayList;
import java.util.Scanner;

public class Genuine_String_Size{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] array = s1.toCharArray();
        int len = array.length, flag = 0;
        ArrayList l1 = new ArrayList<Character>();

        for (int i = 0; i < len; i++)
        {
            l1.add(array[i]);
        }

        for (int i = 0; i < len-1; i++)
        {
            for (int j = i+1 ; j < len; j++)
            {
                if(l1.get(i)==l1.get(j))
                {
                    l1.set(j,"=");
                }
            }
        }

        for(int i=0;i<l1.size();i++)
        {
            if(!l1.get(i).equals("=")) {
                flag++;
            }
        }
        System.out.print(flag);
    }
}