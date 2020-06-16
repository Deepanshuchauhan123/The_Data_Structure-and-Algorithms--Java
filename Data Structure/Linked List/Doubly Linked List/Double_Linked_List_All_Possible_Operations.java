/*
Doubly LinkedList:- * In Doubly linked list we can traverse in both 
		direction.
		* Address of both direction is contained by every 
		single node.

*/
import java.util.*;

public class Double_Linked_List_All_Possible_Operations{

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws Exception {

        LinkedListOperations list = new LinkedListOperations();
        while (true) {
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
            switch (choice) {
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

class Node {
    int Data;
    Node Next;
    Node Prev;
}

class LinkedListOperations {
    Node head;

    void insertNode_At_Last(int data) {
        Node n = head;
        Node node = new Node();
        node.Data = data;
        node.Next = null;
        node.Prev = null;
        if (head == null) {
            head = node;
        } else {
            while (n.Next != null) {
                n = n.Next;
            }
            n.Next = node;
            node.Prev = n;
        }
    }

    void insertNode_At_Middle(int data, int value) {
        Node n = head;
        Node node = new Node();
        node.Data = data;
        node.Next = null;
        node.Prev = null;

        while (n.Data != value) {
            n = n.Next;
        }
        node.Next = n.Next;
        n.Next = node;
        node.Prev = n;

    }

    void insertNode_At_Head(int data) {
        Node n = head;
        Node node = new Node();
        node.Data = data;
        node.Next = null;
        node.Prev = null;
        if (head == null) {
            head = node;
        } else {
            node.Next = head;
            head.Prev = node;
            head = node;
        }
    }

    void show_LinkedList() {
        Node n = head;
        if (head == null) {
            System.out.println("  List is Empty!! ");
        } else {
            System.out.println("Data in the Linked is/are>>>>>");
            while (n != null) {
                System.out.print(n.Data + " ");
                n = n.Next;
            }
        }
    }

    void deleteNode_At_Head() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty!! ");
        } else if (head.Next == null) {
            head = null;
        } else {
            head = head.Next;
            head.Prev = null;
        }
    }

    void deleteNode_At_Last() {
        Node n = head;
        if (head == null) {
            System.out.println("Doubly Linked List is Empty!!");
        } else if (head.Next == null) {
            head = null;
        } else {
            while (n.Next.Next != null) {
                n = n.Next;
            }
            n.Next.Prev = null;
            n.Next = null;
        }
    }

    void deleteNode_At_Mid(int value) {
        Node n = head;
        if (head.Data == value) {
            head = head.Next;
            if (head.Next != null) {
                head.Prev = null;
            }
        } else {
            while (n.Next.Data != value && n != null) {
                n = n.Next;
            }
            n.Next = n.Next.Next;
            if (n.Next != null) {
                n.Next.Next.Prev = n;
            }
        }
    }

}

