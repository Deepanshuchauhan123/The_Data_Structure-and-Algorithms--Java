import java.util.*;

public class Stack_Operations {
    static int top = -1, stack[], size, item;
    static Scanner sc = new Scanner(System.in);

    static {
        Stack_Operations.createStack();
    }

    public static void main(String[] args) {
        int ch;

        while (true) {

            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. TRAVERSE");
            System.out.println("5. EXIT");
            System.out.print("Select Your Choice: ");
            ch = Stack_Operations.sc.nextInt();

            switch (ch) {
                case 1:
                    PUSH();
                    break;
                case 2:
                    POP();
                    break;
                case 3:
                    PEEK();
                    break;
                case 4:
                    TRAVERSE();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Not a Valid Choice. ");
            }
        }

    }

    static void createStack() {

        System.out.println("Enter size of Array");
        size = Stack_Operations.sc.nextInt();
        Stack_Operations.stack = new int[size];
        System.out.println("Stack Created Of Size: " + size);

    }

    static void PUSH() {
        if (top < size) {
            System.out.println("Enter Element To be added: ");
            item = Stack_Operations.sc.nextInt();
            stack[++top] = item;
            System.out.println("Element Added Sucessfully: " + item);
            System.out.println("");
        } else {
            System.out.println("Stack is OverFlow ");
            System.out.println("");
        }
    }

    static void POP() 
   {
        if (top <= -1) 
        {
            System.out.println("Stack is UnderFlow");
            System.out.println("");
        } else 
       {
            System.out.print("Deleted Element is :" + stack[top--]);
            System.out.println("");
        }
    }

    static void PEEK()
   {
        if (top <= -1) 
       {
            System.out.println("Stack is UnderFlow");
            System.out.println("");
        } else 
        {
            System.out.print("Peek Element is :" + stack[top]);
            System.out.println("");
        }
    }

    static void TRAVERSE() 
        {
        if (top <= -1) {
            System.out.println("Stack is UnderFlow");
        } else
            {
            System.out.print("Complete Stack is: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println("");
        }

    }

}