public class Inorder_BinaryTree_Traversal
{

    // Main function for creating node.
    public static void main(String[] args) 
    {
        //Root node is created as head node and other nodes are added as hard coded value
        Node root = new Node(10);
        root.RightChild = new Node(2);
        root.RightChild.LeftChild = new Node(1);
        root.RightChild.RightChild = new Node(4);
        root.LeftChild = new Node(8);
        root.LeftChild.LeftChild = new Node(6);
        root.LeftChild.RightChild = new Node(5);

        System.out.println("Inorder Traversal of Binary Tree");
// Inorder function will call from here and traverse nodes
        Inorder(root);
    }

    public static void Inorder(Node temp) 
    {
//if Node value becomes null that means their is no further nodes in the tree so it return.
        if (temp == null) 
        {
            return;
        }
        //Left node will be called
        Inorder(temp.LeftChild);
        //As on second time as node will be traversed it will print the value.
        System.out.print(temp.data+" ");
        //Right node will be called at last
        Inorder(temp.RightChild);

    }

    // Class Node is static so it will run as the program starts.
    //Their will be two parts of Node namely as LeftNode,RighNode.
    static class Node
    {
        int data;
        Node LeftChild, RightChild;

        //Constructor to initialise the value of the nodes of tree
        Node(int Data)
        {
            data = Data;
            // As node created the left and right part of the node is by default null untill user doesn't add node.
            LeftChild = null;
            RightChild = null;
        }
    }//class node end here
}//main program class end here
