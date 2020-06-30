import java.io.*;
import java.util.*;
public class Right_Most_Node_From_Inorder_of_BinaryTree{
   
 public static void main(String args[] ) throws Exception {

     int array[];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of numbers");
        int n = sc.nextInt();
        System.out.println("Enter Inorder of Binary Tree ");
        array = new int[n];

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

       Node node= create_Tree(array, 0, n - 1);
       System.out.print("Right Most Node in Binary Tree is ");
       System.out.print(right_most(node));
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
    public static int right_most(Node temp)
    {
        
        while(temp.right !=null){
            temp=temp.right;
        }
        return temp.data;
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

