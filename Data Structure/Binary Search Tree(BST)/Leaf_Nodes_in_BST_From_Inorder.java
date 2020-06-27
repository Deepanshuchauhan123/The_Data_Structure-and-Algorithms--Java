import java.util.Scanner;

public class Leaf_Nodes_in_BST_From_Inorder{
    static Node root = null;
    static int count = 0;

    public static void main(String[] args) {
        int array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        array = new int[n];
        System.out.println("Enter Inorder of elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        adjuster(array, 0, n - 1);
        System.out.print(Count_LeafNodes(root));
    }

    public static void adjuster(int array[], int start, int end) {
        int mid;
        if(start<= end){
            mid = (start + end) / 2;
            InsertNode(array[mid]);
            adjuster(array, start, mid - 1);
            adjuster(array, mid + 1, end);
        }


    }


    public static void InsertNode(int value) {
        Node temp = root, n = null;

        // Firstly we should check that whether root is null or not, if null then  we will initialise the root node.
        if (root == null) {
            root = new Node(value);

        } else {

            // Then we will go to the leaf node where the correct position of the user inserted data.
            while (temp != null) {
                if (value < temp.data) {
                    n = temp;
                    temp = temp.LeftChild;
                } else {
                    n = temp;
                    temp = temp.RightChild;
                }
            }
            // Then there we create a node and initialise that's nodes value.
            Node node = new Node(value);
            if (value < n.data) {
                n.LeftChild = node;
            } else {
                n.RightChild = node;
            }
        }
    }

    public static int Count_LeafNodes(Node temp) {
//if Node value becomes null that means their is no further nodes in the tree so it return 0.
        if (temp == null) {
            return 0;
        }
        int left, right;
        // if both left and right node of parent node are null then return 1 bcoz its a leaf node.
        if (temp.LeftChild == null && temp.RightChild == null) {
            return 1;
        }

        left = Count_LeafNodes(temp.LeftChild);
        right = Count_LeafNodes(temp.RightChild);
        return (right + left);

    }

    //Their will be two parts of Node namely as LeftNode,RighNode as its a binary tree.
    static class Node {
        int data;
        Node LeftChild, RightChild;

        //Constructor to initialise the value of the nodes of tree
        Node(int Data) {
            data = Data;
            // As node created the left and right part of the node is by default null untill user doesn't add node.
            LeftChild = null;
            RightChild = null;
        }
    }//class node end here
}//main program class end here
