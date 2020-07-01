import java.util.Scanner;

public class Two_BinaryTrees_Identical_or_Not{


    static int sum = 1;

    public static void main(String[] args) 
    {
        int array[], array2[];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of Nodes of First Binary Tree ");
        int n = sc.nextInt();
        array = new int[n];
        
        System.out.println("Enter Inorder of First Binary Tree ");
        for (int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }
        
        
        System.out.println("Enter Number of Nodes of Second Binary Tree ");
        int n2 = sc.nextInt();
        array2 = new int[n2];
        
        System.out.println("Enter Inorder of Second Binary Tree ");
        for (int i = 0; i < n2; i++) 
        {
            array2[i] = sc.nextInt();
        }

        Node node = create_Tree(array, 0, n - 1);
        Node node2 = create_Tree(array2, 0, n2 - 1);


        if (Check_Similear(node, node2))
            System.out.print("Both Trees are Similear");
        else
            System.out.print("Both Trees are Dis-similear");

    }

    public static Node create_Tree(int array[], int start, int end) 
    {

        if (start > end)
            return null;
        int max = min_Finder(array, start, end);
        Node n = new Node(array[max]);

        n.left = create_Tree(array, start, max - 1);
        n.right = create_Tree(array, max + 1, end);

        return n;
    }

    public static int min_Finder(int array[], int start, int end) 
    {

        int min = start;
        for (int i = start + 1; i <= end; i++) 
        {
            if (array[i] < array[min]) 
            {
                min = i;
            }
        }
        return min;
    }

    public static boolean Check_Similear(Node temp, Node temp2) 
    {

        if (temp == null && temp2 == null) 
        {
            return true;
        }

        if (temp != null && temp2 != null) 
        {
            return ((temp.data == temp2.data) && Check_Similear(temp.left, temp2.left) && Check_Similear(temp.right, temp2.right));
        }
        return false;
    }
}

class Node 
{
    int data;
    Node left, right;

    Node(int value) 
    {
        data = value;
        left = right = null;
    }
}
