import java.io.*;
import java.util.*;
public class Swapping_Head_and_Tail_in_LinkedList{

     static Scanner sc = new Scanner(System.in);
    public static void main(String args[] ) throws Exception {

        LinkedListOperations list = new LinkedListOperations();
        int cases=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<cases;i++){
            list.insertNode_At_Last(sc.nextLine());
        }
        list.Swap_Head_tail();
        list.show_LinkedList();

    }
}
class Node
{
    String Data;
    Node Next;
}
class LinkedListOperations
{
    Node head;


    void insertNode_At_Last(String data)
    {
        Node node = new Node();
        node.Data = data;
        node.Next = null;
        if (head == null)
        {
            head = node;
        } else
        {
            Node n = head;
            while (n.Next != null)
            {
                n = n.Next;
            }
            n.Next = node;
        }
    }
    void show_LinkedList()
    {
        Node n = head;
        if (head == null)
        {

        } else
        {
            int sum=0;
            while (n.Next != null)
            {

                System.out.print(n.Data);
                
                System.out.print("\n");

                n = n.Next;
                sum++;
            }

            System.out.print(n.Data);

        }



    }
    void Swap_Head_tail(){
        
        Node n=head;
        Node temp=null;
        Node Value=head;       
       
            while(n.Next != null){
                  temp = n;
                n=n.Next;
                }
                temp.Next=Value;
                head=Value.Next;
                Value.Next=null;
                n.Next=head; 
                head=n;
            }   
}