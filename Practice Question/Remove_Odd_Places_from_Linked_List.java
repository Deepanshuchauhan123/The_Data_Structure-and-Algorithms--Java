import java.util.*;

public class Remove_Odd_Places_from_Linked_List{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws Exception {

        LinkedListOperations list = new LinkedListOperations();
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            list.insertNode_At_Last(sc.nextInt());
        }
        list.delete_Odd();
        list.show_LinkedList();

    }
}

class Node {
    int Data;
    Node Next;
}

class LinkedListOperations {
    Node head;

    void insertNode_At_Last(int data) {
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

    void show_LinkedList() {
        Node n = head;
        if (head == null) {
            System.out.println("\n Linkedlist is Empty !!!");
        } else {
            while (n.Next != null) {
                System.out.println(n.Data);
                n = n.Next;
            }
            System.out.print(n.Data);
        }
    }

    void delete_Odd() {
        int count = 1;
        Node n = head;
        Node temp = null;
        if (n.Next == null) {
            head = null;
        } else {
            while (n.Next != null) {
                if (count % 2 != 0) {
                    if (n == head) {
                        head = head.Next;
                    } else
                        temp.Next = n.Next;
                }

                count++;
                temp = n;
                n = n.Next;
            }
            if (count % 2 != 0) {
                temp.Next = null;
            }

        }

    }
}