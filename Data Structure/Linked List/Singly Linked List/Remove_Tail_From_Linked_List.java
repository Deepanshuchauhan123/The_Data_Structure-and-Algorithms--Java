import java.util.*;

public class Remove_Tail_From_Linked_List{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws Exception {

        LinkedListOperations list = new LinkedListOperations();
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            list.insertNode_At_Last(sc.nextInt());
        }
        list.RemoveTail();
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

        } else {
            int sum = 0;
            while (n.Next != null) {

                System.out.print(n.Data);

                System.out.print("\n");

                n = n.Next;
                sum++;
            }

            System.out.println(n.Data);
        }
    }

    void RemoveTail() {
        Node n = head;
        Node temp = null;
        if (head.Next == null) {
            head = null;
        } else {
            while (n.Next != null) {
                temp = n;
                n = n.Next;
            }
            temp.Next = null;
        }
    }
}