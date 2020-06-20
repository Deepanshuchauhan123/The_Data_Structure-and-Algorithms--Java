import java.util.*;

public class Reverse_About_point_Queue
{
    static int front =-1,rear=-1,queue[],size,count=0, array[]=new int[20];
    static Scanner sc=new Scanner(System.in);

    static
    {
        System.out.print("Enter Size of Queue: ");
        size=sc.nextInt();
        queue=new int[size];
    }
    public static void main(String[] args)
    {
        int reversal_point=sc.nextInt();
        for(int i=0;i<size;i++){
            ENQUEUE(sc.nextInt());

        }
        Reverse_About_point(reversal_point-1);


    }

    public static void ENQUEUE(int value)
    {
        System.out.print("\n Enter Value to be Added in Queue: ");


        if(front == -1 && rear==-1)
        {
            front=0;
            rear=0;
            queue[rear]=value;
        }else
        if(rear==size-1)
        {
            System.out.println("Queue OverFlow");
        }else
        {
            queue[++rear]=value;
        }
    }

    public static void Reverse_About_point(int point){

        for(int i=point-1;i>=0;i--){
            System.out.print(queue[i]);
            System.out.print(" ");
        }
        System.out.print(queue[point]);

        for(int i=size-1;i>point;i--){
            System.out.print(" ");
            System.out.print(queue[i]);

        }
    }
}