/* 
 * Count Negative from End
*/

import java.io.*;
import java.util.*;
public class Count_Negative_From_end_of_Fixed_Range_in_LinkedList{
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }
        System.out.println("Enter Range");
        int range=sc.nextInt();
        list.Reverse_LinkedList();
        list.Count_Bad(range);
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
    void Count_Bad(int range)
    {
        Node n = head;
        int count=0,result=0;
        while(count !=range){
            if(n.Data <0){
                result++;
            }
            n=n.Next;
            count++;
        }
      System.out.print(result);
    }
}
