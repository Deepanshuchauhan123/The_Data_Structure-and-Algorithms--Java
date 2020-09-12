import java.util.Scanner;

public class Majority_of_Number
{
    public static void main(String[] args)
    {

        int num,array[],count=1;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        array = new int[num];

        for(int i=0;i<num;i++)
        {
            array[i]=sc.nextInt();

        }
        for(int i=0;i<num-1;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(array[i]==array[j])
                {
                    count++;
                }
            }
            if(count >num/2)
            {
                System.out.print(array[i]);
                break;
            }else
                {
                count=1;
                }

        }
        if(count==1)
        {
            System.out.print(-1);
        }

    }
}

