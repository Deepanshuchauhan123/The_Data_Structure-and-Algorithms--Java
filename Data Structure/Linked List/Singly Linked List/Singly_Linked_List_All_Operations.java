/*
Linked List Implementation: Random memory location
*/

import java.util.*;

public class Singly_Linked_List_All_Operations
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        LinkedListOperations list = new LinkedListOperations();

        while (true)
        {
            System.out.println("\n Enter your choice");
            System.out.println("1. Enter Element at Last");
            System.out.println("2. Enter Element at Mid");
            System.out.println("3. Enter Element at Starting");
            System.out.println("4. Delete Element at Last");
            System.out.println("5. Delete Element at Mid");
            System.out.println("6. Delete Element at Starting");
            System.out.println("7. Traverse LinkedList");
            System.out.println("8. EXIT");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("\n Enter Element to be added at Tail: ");
                    int taildata = sc.nextInt();
                    System.out.println("");
                    list.insertNode_At_Last(taildata);
                    break;
                case 2:
                    System.out.print("\n Enter node data after which element is to be added: ");
                    int after_data = sc.nextInt();
                    System.out.print("\n Enter New Node Value:");
                    int mid_data = sc.nextInt();
                    list.insertNode_At_Middle(mid_data, after_data);
                    break;
                case 3:
                    System.out.print("\n Enter Element to be added at Head: ");
                    int headdata = sc.nextInt();
                    System.out.println("");
                    list.insertNode_At_Head(headdata);
                    break;
                case 4:
                    list.deleteNode_At_Last();

                    break;
                case 5:
                    System.out.println("Enter element to be deleted:");
                    int mid_del = sc.nextInt();
                    list.deleteNode_At_Mid(mid_del);
                    break;
                case 6:
                    list.deleteNode_At_Head();
                    break;
                case 7:
                    list.show_LinkedList();
                    break;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter a Valid Choice");
            }


        }
    }
}
// Working similear with structure in C language
class Node
{
    int Data;
    Node Next;
}

class LinkedListOperations
{
    Node head;

    void insertNode_At_Last(int data)
    {
	// Memory is allocated with new operator

        Node node = new Node();
        node.Data = data;
        node.Next = null;
        if (head == null)
        {
            head = node;
        } else
            {
                 Node n = head;
                 while (n.Next != null)
                 {
                    n = n.Next;
                 }
                 n.Next = node;
            }
    }

    void insertNode_At_Head(int data)
    {
        Node node = new Node();
        node.Data = data;
        node.Next = null;
        if (head != null)
        {
            node.Next = head;
        }
        head = node;

    }

    void insertNode_At_Middle(int data, int after_data)
    {
        Node node = new Node();
        node.Data = data;
        node.Next = null;
        if (head == null)
        {
            head = node;
        } else
            {
            Node n = head;
            while (n.Data != after_data)
            {
                n = n.Next;
                if (n.Next == null)
                {
                    break;
                }
            }
            if (n.Data != after_data)
            {
                System.out.println("Element not found!! ");
            } else {
                node.Next = n.Next;
                n.Next = node;
            }

        }

    }

    void deleteNode_At_Last()
    {
        Node n = head;
        Node temp = null;
        if (head == null)
        {
            System.out.println("\nLinked List is Empty");
        } else if (head.Next == null)
        {
            head = null;
        } else
            {
                while (n.Next != null)
                {
                    temp = n;
                    n = n.Next;
                }
                temp.Next = null;
            }

    }

    void deleteNode_At_Head()
    {
        Node n = head;
        if (head == null)
        {
            System.out.println("\nLinked List is Empty");
        } else if (head.Next == null)
        {
            head = null;
        } else
            {
                head = n.Next;
            }

    }

    void deleteNode_At_Mid(int data)
    {
        Node n = head;
        Node temp = null;
        if (head == null)
        {
            System.out.println("\nLinked List is Empty");
        }
        if (head.Data == data)
        {
            head = n.Next;
        } else
            {
                while (n.Data != data && n.Next != null)
                {
                    temp = n;
                    n = n.Next;
                }
                if (n.Data != data)
                {
                    System.out.println("Element not found!! ");
                } else
                    {
                        temp.Next = n.Next;
                    }
            }
    }

    void show_LinkedList()
    {
        Node n = head;
        if (head == null)
        {
            System.out.println("\n Linkedlist is Empty !!!");
        } else
            {
                while (n.Next != null)
                {
                    System.out.print(n.Data + " ");
                    n = n.Next;
                }
                System.out.print(n.Data);
            }
    }

}