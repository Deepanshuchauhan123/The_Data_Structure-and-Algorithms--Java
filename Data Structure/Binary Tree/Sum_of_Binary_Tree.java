import java.io.*;
import java.util.*;
public class Sum_of_Binary_Tree{

    static int sum=0;
    public static void main(String args[] ) throws Exception {
    
    int array[];
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
     
        array = new int[n];

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

       Node node= create_Tree(array, 0, n - 1);
    
       Preorder(node);
       System.out.print(sum);
    }

    public static Node create_Tree(int array[], int start, int end) {

        if(start>end)
            return null;
        int min=min_Finder(array,start,end);
        Node n=new Node(array[min]);

        n.left=create_Tree(array,start,min-1);
        n.right=create_Tree(array, min+1, end);

        return n;

    }

    public static int min_Finder(int array[], int start, int end) {

        int min =start;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
     public static void Preorder(Node temp)
    {

        if (temp == null)
        {
            return;
        }        
        sum=sum+temp.data;

        Preorder(temp.left);
    
        Preorder(temp.right);

    }
}

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

