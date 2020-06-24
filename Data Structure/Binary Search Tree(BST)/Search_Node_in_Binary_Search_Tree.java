/*
Searcing in Binary Search Tree that whether an element is present or not.
*/

import java.util.Scanner;

public class Search_Node_in_Binary_Search_Tree
{
    static Node root = null;

    // Main function for creating node.
    public static void main(String[] args) 
    {
        System.out.println("::::::::::::Search an element in Binary Search Tree ::::::::");

        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n1. Add Node to the Binary Search Tree:");
            System.out.println("2.Search an Element in Binary Search Tree:");
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
                    System.out.print("Enter Element to be Searched:  ");
                    search_BST(root, sc.nextInt());
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter valid choice!!!!");
            }

        }
    }

    public static void InsertNode(int value) 
    {
        Node temp = root, n = null;

        // Firstly we should check that whether root is null or not, if null then  we will initialise the root node.
        if (root == null) 
        {
            root = new Node(value);

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

    public static void search_BST(Node temp, int value) 
    {
        int flag = 0;
        while (temp != null) 
        {
            if (temp.data == value) 
            {
                System.out.println("Element is Present in BST");
                flag = 1;
                break;
            } else if (temp.data < value) 
            {
                temp = temp.RightChild;
            } else 
                {
                temp = temp.LeftChild;
                }
        }
        if (flag == 0) 
        {
            System.out.println("Element Not Present in BST");
        }

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
    }//class node end here
}//main program class end here