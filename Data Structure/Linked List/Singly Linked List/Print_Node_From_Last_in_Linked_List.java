import java.io.*;
import java.util.*;
public class Print_Node_From_Last_in_Linked_List{
  

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }
        list.Reverse_LinkedList();
	System.out.println("Enter Node position from last");
        list.show_Value(sc.nextInt());
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
     void show_Value(int pos){
        Node current = head;
        int count=1;
        while(count !=pos){
            current=current.Next;
            count++;
        }
        System.out.print(current.Data);
    }
}