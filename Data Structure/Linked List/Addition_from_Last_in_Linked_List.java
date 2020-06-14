

import java.io.*;
import java.util.*;
public class Addition_from_Last_in_Linked_List{
 static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();
        System.out.println("Enter Nodes");
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }
        System.out.println("Enter number of  Nodes to be added from last");
        int val=sc.nextInt();
        list.Reverse_LinkedList();
        System.out.print("Sum of last "+ val +" Nodes is ");
        list.addition(val);
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
    void addition(int val)
    {
        int count=0,sum=0;
        Node n = head;
       
            while (count++ != val)
            {
                sum += n.Data;
                n = n.Next;
            }
            System.out.print(sum);
        
    }
}
