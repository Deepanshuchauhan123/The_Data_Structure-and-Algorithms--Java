import java.util.Scanner;

public class Move_Middle_Node_To_Last
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws Exception 
    {

        LinkedListOperations list = new LinkedListOperations();
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) 
        {
            list.insertNode_At_Last(sc.nextInt());
        }

        list.middle_to_last(cases / 2 + 1);
        list.show_LinkedList();

    }
}

class Node 
{
    int data;
    Node next;
}

class LinkedListOperations 
{
    Node head = null;
    Node n = null;

    public void insertNode_At_Last(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) 
        {
            head = node;
        } else 
            {
            n = head;
            while (n.next != null) 
            {
                n = n.next;

            }
            n.next = node;
        }
    }

    public void show_LinkedList() 
    {
        if (head != null) 
        {
            n = head;
            while (n.next != null) 
            {
                System.out.println(n.data);
                n = n.next;
            }
            System.out.print(n.data);
        }
    }

    public void middle_to_last(int mid) 
    {
        Node n1 = null;
        n = head;
        int count = 2;
        if (head != null) 
        {
            while (count != mid) 
            {
                count++;
                n = n.next;

            }
            n1 = n;
            while (n1.next != null) 
            {
                n1 = n1.next;

            }

            n1.next = n.next;
            n.next = n1.next.next;
            n1.next.next = null;

        }
    }


}
