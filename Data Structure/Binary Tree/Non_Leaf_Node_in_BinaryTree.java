
public class Non_Leaf_Node_in_BinaryTree
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

        System.out.println("Number of Non-Leaf Nodes in Binary Tree");
        // Count_Nodes function will call from here and count Non Leaf nodes
        int count=Count_Non_LeafNodes(root);
        //print the value returned after calculating numbers of Leaf nodes.
        System.out.println("Leaf Nodes = "+count);
    }

    public static int Count_Non_LeafNodes(Node temp)
    {
//if Node value becomes null that means their is no further nodes in the tree so it return 0.
        if (temp == null)
        {
            return 0;
        }
        int left,right;
        // if  left or right node of parent node are not null then return 1 because its a non leaf node.
        if(temp.LeftChild!=null || temp.RightChild!=null)
        {
            left=Count_Non_LeafNodes(temp.LeftChild);
            right=Count_Non_LeafNodes(temp.RightChild);
            return (1+right+left);
        }
        return 0;

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