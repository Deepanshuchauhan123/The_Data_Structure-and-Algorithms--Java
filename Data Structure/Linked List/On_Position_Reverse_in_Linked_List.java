import java.util.*;

public class On_Position_Reverse_in_Linked_List{

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws Exception {

        LinkedListOperations list = new LinkedListOperations();
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            list.insertNode_At_Last(sc.nextInt());
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


    void insertNode_At_Last(int data) {
        int num = 0;
        Node node = new Node();

        while (data != 0) {
            num = num * 10 + (data % 10);
            data = data / 10;
        }
        node.Data = num;
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

            System.out.print(n.Data);

        }


    }

}

