import java.util.*;

public class Reverse_A_LinkedList{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }
        list.Reverse_LinkedList();
        list.show_LinkedList();
    }
}

class Node {
    int Data;
    Node Next;
}

class LinkedListOperations {
    Node head;

    void insert_Node(int data) {
        Node node = new Node();
        node.Data = data;
        node.Next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.Next != null) {
                n = n.Next;
            }
            n.Next = node;
        }
    }
    void Reverse_LinkedList(){
        Node current = head;
        Node next=null;
        Node prev=null;

        while(current != null){
            next=current.Next;
            current.Next=prev;
            prev=current;
            current=next;
        }
        head=prev;
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