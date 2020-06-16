/*
This program will count how many time any paticular value repeat
itself in a linked List
*/
import java.io.*;
import java.util.*;
public class Count_any_Instance_in_a_LinkedList{
   
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }
	System.out.println("Enter number to check its repetation");
        list.Count_instance_LinkedList(sc.nextInt());
       
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
    void Count_instance_LinkedList(int data){
        Node current = head;
        int count=0;

        while(current != null){
            if(current.Data ==data ){
                count++;
            }
            current=current.Next;

        }
        System.out.print(count);
        
    }
   
}