/* 
 * Count total Negative in a linked list
*/

import java.io.*;
import java.util.*;
public class Count_Negative_In_LinkedList{
  
  static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }
        
       
       
        list.Count_Bad();
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
   
    void Count_Bad()
    {
        Node n = head;
        int result=0;
        while(n !=null){
            if(n.Data <0){
                result++;
            }
            n=n.Next;
           
        }
      System.out.print(result);
    }
}
