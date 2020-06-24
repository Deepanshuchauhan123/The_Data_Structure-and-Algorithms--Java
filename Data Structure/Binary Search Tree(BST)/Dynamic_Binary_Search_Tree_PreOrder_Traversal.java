/*
Binary Search Tree:
		All smaller node than parent node should go to the 
		left and larger will go to the right of parent.
*/

import java.util.Scanner;

public class Dynamic_Binary_Search_Tree_PreOrder_Traversal{
    static Node root=null;

    // Main function for creating node.
    public static void main(String[] args)
    {
        System.out.println(":::::::::::: Binary Search Tree ::::::::");

        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n1. Add Node to the Binary Search Tree:");
            System.out.println("2. Preorder Traversal of Binary Search Tree:");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice:");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter node Data: ");
                    InsertNode(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Pre-Order Traversal is :: ");
                    Preorder(root);
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter valid choice!!!!");
            }

        }
    }

    public static void InsertNode(int value) {
        Node temp = root, n = null;

        // Firstly we should check that whether root is null or not, if null then  we will initialise the root node.
        if (root == null) {
            root=new Node(value);

        } else {

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

    public static void Preorder(Node temp)
    {

//if Node value becomes null that means their is no further nodes in the tree so it return.
        if (temp == null)
        {
            return;
        }
        //First time as node will be traversed it will print the value.
        System.out.print(temp.data+" ");
        //Left node will be called
        Preorder(temp.LeftChild);
        //Right node will be called at last
        Preorder(temp.RightChild);

    }

    //Their will be two parts of Node namely as LeftNode,RighNode as its a binary tree.
    static class Node
    {
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

