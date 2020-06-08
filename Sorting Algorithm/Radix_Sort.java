import java.util.Scanner;

public class Radix_Sort
{
    static int size,max=0,dumy_array[];
    static int array[] = new int[20];

    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        size=sc.nextInt();
        dumy_array=new int[size];
        System.out.println("Enter Elements: ");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        for(int i=1;0<max/i;i=i*10)
        {
            count_Sort(array,i);
        }
        System.out.println("After Radix Sort Elements: ");
        
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void count_Sort(int array[],int pos)
    {
        int count_array[]=new int[10];

        for(int i=0;i<10;i++)
        {
            count_array[i]=0;
        }

        for(int i=0;i<size;i++)
        {
            ++count_array[(array[i]/pos)%10];
        }
        for(int i=1;i<10;i++)
        {
            count_array[i] +=count_array[i-1];
        }
        for(int i=size-1;i>=0;i--)
        {
            dumy_array[--count_array[(array[i]/pos)%10]]=array[i];
        }
        for(int i=0;i<size;i++)
        {
            array[i]=dumy_array[i];
        }
    }
}