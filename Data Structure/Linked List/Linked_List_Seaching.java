import java.util.*;

public class Linked_List_Seaching{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();
        System.out.println("Enter Nodes:");
        for (int i = 0; i < size; i++) {
            list.insert_Node(sc.nextInt());
        }


        System.out.print("Enter Nodes to be searched:");
        list.Checker(sc.nextInt());
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

    void Checker(int num) {
        Node n = head;
        while (n != null) {
            if (n.Data == num) {
                System.out.print("1");
                return;

            }
            n = n.Next;
        }
        System.out.print("0");
        return;
    }
}
