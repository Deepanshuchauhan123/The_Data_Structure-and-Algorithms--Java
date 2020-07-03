/*
Important Note::::   Complete Binary Tree defination may vary from Books 
	 	to Books here i am calling a Complete binary tree as :-
		"A Complete binary tree is a type of binary tree in which every internal node 
		has exactly two child nodes and all the leaf nodes are at the same level."
*/
import java.util.Scanner;

public class Check_Complete_Binary_Search_Tree{

    static Node root = null;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number of Total Nodes ");
        int n = sc.nextInt();
        
        System.out.print("\n Enter Nodes ");
        for (int i = 0; i < n; i++)
        {
            InsertNode(sc.nextInt());
        }
        
        
        if(isComplete(root)){
            System.out.println("\nBinary Search Tree is Complete Tree");
        }else
            System.out.println("\nBinary Search Tree is Not a Complete Tree");
    }

    public static void InsertNode(int value)
    {
        Node temp = root, n = null;

        // Firstly we should check that whether root is null or not, if null then  we will initialise the root node.
        if (root == null)
        {
            root = new Node(value);

        } else
            {

                // Then we will go to the leaf node where the correct position of the user inserted data.
                while (temp != null)
                {
                    if (value < temp.data)
                    {
                        n = temp;
                        temp = temp.LeftChild;
                    } else
                        {
                            n = temp;
                            temp = temp.RightChild;
                        }
                }
                // Then there we create a node and initialise that's nodes value.
                Node node = new Node(value);
                if (value < n.data)
                {
                    n.LeftChild = node;
                } else
                    {
                        n.RightChild = node;
                    }
            }
    }


    public static boolean isComplete(Node temp)
    {
//if Node value becomes null that means their is no further nodes in the tree so it return 0.
        if (temp == null)
        {
            return true;
        }
        // for Leaf Node
        if (temp.LeftChild == null && temp.RightChild == null)
        {
            return true;
        }
        // Non leaf node whose both child are present
        else if (temp.RightChild != null && temp.LeftChild != null)
        {
            return (isComplete(temp.LeftChild) && isComplete(temp.RightChild));
        }
        // for non leaf node having one child only
        else
            return false;
    }

    //Their will be two parts of Node namely as LeftNode,RighNode as its a binary tree.
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
    }
}
