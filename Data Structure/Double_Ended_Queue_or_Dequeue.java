/*
Double Ended Queue in this Queue insertation and deletation can be done from both the ends.

Practical Use:
	In Multi Processor Computer.
	Example:
	 Let's suppose their is one processor doing different task and one of the process
	gets completed early and another process is still running so the free thread takes 
	the process from the last or rear of the thread 1 and start processing it by adding it to
	the front of its processing and in this way both work get finished early time.
	
*/
import java.util.Scanner;

public class Double_Ended_Queue_or_Dequeue
{
    static int front = -1, rear = -1, queue[], size;
    static Scanner sc = new Scanner(System.in);

    static
    {
        System.out.println("Double Sided Queue (Dequeue)");
        System.out.print("Enter Size of Queue: ");
        size = sc.nextInt();
        queue = new int[size];
    }

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("\nEnter Your Choice: ");
            System.out.println("1. Insert At Front");
            System.out.println("2. Insert At Rear");
            System.out.println("3. Delete At Front");
            System.out.println("4. Delete At Rear");
            System.out.println("5. Peek Front");
            System.out.println("6. Peek Rear");
            System.out.println("7. Traverse");
            System.out.println("8. EXIT");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insert_At_Front();
                    break;
                case 2:
                    insert_At_Rear();
                    break;
                case 3:
                    delete_At_Front();
                    break;
                case 4:
                    delete_At_Rear();
                    break;
                case 5:
                    peek_Front();
                    break;
                case 6:
                    peek_Rear();
                    break;
                case 7:
                    TRAVERSE();
                    break;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Choice!!!!");

            }
        }

    }

    public static void insert_At_Front()
    {
        System.out.print("\n Enter Value to be Added in Front of Queue: ");
        int value = sc.nextInt();

        if (front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            queue[front] = value;
        } else if ((front + size - 1) % size == rear)
        {
            System.out.println("Queue OverFlow");
        } else
            {
            front = (front + size - 1) % size;
            queue[front] = value;
        }
    }

    public static void insert_At_Rear()
    {
        System.out.print("\n Enter Value to be Added in Rear of Queue: ");
        int value = sc.nextInt();

        if (front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            queue[rear] = value;
        } else if ((rear + 1) % size == front)
        {
            System.out.println("Queue OverFlow");
        } else
            {
            rear = (rear + 1) % size;
            queue[rear] = value;
        }
    }

    public static void delete_At_Front()
    {

        if (front == -1 && rear == -1)
        {
            System.out.println("Queue is Empty!!!");
        } else if (front == rear)
        {
            System.out.print("\nDequeued Element is : " + queue[front]);
            front = -1;
            rear = -1;
        } else
            {

            System.out.print("\nDequeued Element is : " + queue[front % size]);
            front = (front + 1) % size;
        }
    }


    public static void delete_At_Rear()
    {

        if (front == -1 && rear == -1)
        {
            System.out.println("Queue is Empty!!!");
        } else if (front == rear)
        {
            System.out.print("\nDequeued Element is : " + queue[rear]);
            front = -1;
            rear = -1;
        } else
            {

            System.out.print("\nDequeued Element is : " + queue[rear % size]);
            rear = (rear + size - 1) % size;
        }
    }

    public static void peek_Front()
    {
        if (front == -1 && rear == -1)
        {
            System.out.println("Queue is Empty!!!");
        } else
            {
            System.out.print("\n Queue Front Peek Element is :  " + queue[front]);
        }
    }

    public static void peek_Rear()
    {
        if (front == -1 && rear == -1)
        {
            System.out.println("Queue is Empty!!!");
        } else {
            System.out.print("\n Queue Rear Peek Element is :  " + queue[rear]);
        }
    }

    public static void TRAVERSE()
    {

        if (front == -1 && rear == -1)
        {
            System.out.println("Queue is Empty!!!");
        } else
            {
            System.out.print("\n Queue Elements are:  ");
            for (int i = front; i != rear; i = (i + 1) % size)
            {
                System.out.print(queue[i] + " ");
            }
            System.out.print(queue[rear]);
        }
    }
}