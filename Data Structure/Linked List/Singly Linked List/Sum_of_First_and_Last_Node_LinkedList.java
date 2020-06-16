

import java.io.*;
import java.util.*;
public class Sum_of_First_and_Last_Node_LinkedList{
   
 static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }
       
        list.sum();
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
  
    void sum()
    {
        Node n = head;
        Node temp=null;
        int sum=0;
        while(n!=null){
            temp=n;
            n=n.Next;
            
        }
      System.out.print("Sum of Head and Tail is "+(temp.Data+head.Data));
    }
}
