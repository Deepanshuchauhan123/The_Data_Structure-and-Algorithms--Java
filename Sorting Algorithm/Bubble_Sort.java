import java.util.*;

public class Bubble_Sort
{
    public static void main(String[] args)
    {

        int n,temp;
        int array[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Inputs");
        n=sc.nextInt();
        System.out.println("Enter Numbers");
        for(int i=0;i<n;i++)
        {
             array[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {

            for(int j=0;j<n-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+"  ");
        }

    }

}