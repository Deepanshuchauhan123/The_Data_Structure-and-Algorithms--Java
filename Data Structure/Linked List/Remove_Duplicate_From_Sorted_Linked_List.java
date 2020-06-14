

import java.io.*;
import java.util.*;
public class Remove_Duplicate_From_Sorted_Linked_List{
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
      
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }
        
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
            if(n.Data!=data){
                 n.Next = node;
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
                System.out.println(n.Data);
                n = n.Next;
            }
            System.out.print(n.Data);
        }
    }
}
