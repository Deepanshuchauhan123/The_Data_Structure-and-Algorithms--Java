import java.util.Scanner;

public class Queue_Using_Array
{
    static int top = -1, Queue[], size, item;
    static Scanner sc = new Scanner(System.in);

    static {
        MyClass.createStack();
    }

    public static void main(String[] args) {
        int ch;

        while (true) {

            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. PEEK");
            System.out.println("4. EXIT");
            System.out.print("Select Your Choice: ");
            ch = MyClass.sc.nextInt();

            switch (ch) {
                case 1:
                    ENQUEUE();
                    break;
                case 2:
                    DEQUEUE();
                    break;
                case 3:
                    PEEK();
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Not a Valid Choice. ");
            }
        }

    }

    static void createStack() {

        System.out.println("Enter size of Queue");
        size = MyClass.sc.nextInt();
        MyClass.Queue = new int[size];
        System.out.println("Queue Created Of Size: " + size);

    }

    static void ENQUEUE() {
        if(top>=size-1){
            System.out.println("Queue Over-Flow");
        }else{
            Queue[++top]=sc.nextInt();
        }
    }

    static void DEQUEUE()
    {
        if(top ==-1){
            System.out.println("\n Queue is Empty ");
        }else{
            System.out.println("Deleted Element:  "+Queue[0]);
            for(int i=0;i<top;i++){
                Queue[i]=Queue[i+1];
            }
            top--;
        }
    }

    static void PEEK()
    {
        if(top==-1){
            System.out.println("Queue Under-Flow");
        }else{
            System.out.println(Queue[0]);
        }
    }

}
