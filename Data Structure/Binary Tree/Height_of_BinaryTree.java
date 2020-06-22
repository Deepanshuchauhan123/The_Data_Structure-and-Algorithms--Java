/*
Height of BinaryTree:: calculating the longest possible path from root
		     node to the leaf node.
Assumptions           :: Assuming that leaf node height is zero(0).
*/

public class Height_of_BinaryTree
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
        root.LeftChild.RightChild.LeftChild=new Node(11);
        root.LeftChild.RightChild.RightChild=new Node(12);

        System.out.println("Height of Binary Tree");
        // HeightOf_Tree function will call from here and find height of tree

        int count=HeightOf_Tree(root);
        //print the value returned after calculating Height of binary Tree.
        System.out.println("Height of Binary Tree = "+count);
    }

    public static int HeightOf_Tree(Node temp)
    {
//if Node value becomes null that means their is no further nodes in the tree so it return 0.
        if (temp == null)
        {
            return 0;
        }
        if(temp.LeftChild==null && temp.RightChild==null)
            return 0;

        int left_height,right_height;
        //height of left sub tree and right sub tree is calculated.
        left_height=HeightOf_Tree(temp.LeftChild);
        right_height=HeightOf_Tree(temp.RightChild);
        //Returning the maximum of left sub tree or right sub tree.
        return (1+((left_height>right_height)?left_height:right_height));


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
