/*
Deleting Node From Binary Search Tree such that after deleting that node property 
	of Binary Search Tree will be maintained.
*/

import java.util.Scanner;

public class Delete_Node_From_Binary_Search_Tree{
    static Node root = null;

    // Main function for creating node.
    public static void main(String[] args) {
        System.out.println("::::::::::::Delete an element from Binary Search Tree and its Traversal ::::::::");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Node to the Binary Search Tree:");
            System.out.print("2. Pre-order Traversal:");
            System.out.print("\n3. Inorder Traversal:");
            System.out.print("\n4. Post-order Traversal:");
            System.out.print("\n5. Delete a node from the BST ");
            System.out.print("\n6. Exit");
            System.out.println("Enter your Choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter node Data: ");
                    InsertNode(sc.nextInt());
                    break;
                case 2:
                    Preorder(root);
                    break;
                case 3:
                    Inorder(root);
                    break;
                case 4:
                    Postorder(root);
                    break;
                case 5:
                    System.out.print("Enter Element to be Deleted:  ");
                    delete_Node(root, sc.nextInt());
                    break;
                case 6:
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
    // This functon delete any particular node from BST
    public static void delete_Node(Node temp, int value) {
        int flag = 0;
        Node n = null;

        //This while loop findout the particular node/ location of that node.
        while (temp != null) {
            if (temp.data == value) {

                flag = 1;
                break;
            } else if (temp.data < value) {
                n = temp;
                temp = temp.RightChild;
            } else {
                n = temp;
                temp = temp.LeftChild;
            }
        }
        // if flag is equals to 0 then then node not found
        if (flag == 0) {
            System.out.println("Element Not Present in BST");
        } else 
            {
            // firstly we check that whether node is present at Root Node or not.
                
            if (root.data == value) 
            {
                // For deleting root node we have to check following conditions.
                
                //if only root node is available then assign root to null and BST becomes empty.
                if (root.LeftChild == null && root.RightChild == null)
                    root = null;
                
                
                else if (root.LeftChild == null) 
                {
                    //if only right node is present and leftchild is null then assign root as right child first node
                    root = root.RightChild;
                } else if (root.RightChild == null) 
                {
                    root = root.LeftChild;
                } else 
                    {
                    //when both child of root node are present then inOrder predecessor becomes root node
                    Node pre, post = null;
                    pre = temp.LeftChild;

                    if (pre.RightChild == null) 
                    {
                        temp.data = pre.data;
                        temp.LeftChild = pre.LeftChild;
                    } else 
                        {
                            while (pre.RightChild != null) 
                            {
                                post = pre;
                                pre = pre.RightChild;
                            }
                            temp.data = pre.data;
                            if (pre.LeftChild != null) 
                            {
                                post.RightChild = pre.LeftChild;
                            } else 
                                {
                                post.RightChild = null;
                                }
                        }
                    root = temp;

                    }
            } else if (temp.RightChild == null && temp.LeftChild == null) 
            {

                // case 2 when leaf node will be deleted
                if (n != null) 
                {
                    if (n.LeftChild != null && n.LeftChild.data == value) 
                    {
                        n.LeftChild = n.LeftChild.LeftChild;

                    } else if (n.RightChild != null && n.RightChild.data == value) 
                    {
                        n.RightChild = null;
                    }
                }


            } else if (temp.LeftChild == null) 
            {
                // case 3. when only right child is present
                
                if (n != null) 
                {
                    // if we won't check that n.Leftchild != null then it will throw null pointer exception.
                    if (n.LeftChild != null && n.LeftChild.data == value) 
                    {
                        n.LeftChild = temp.RightChild;
                    } else if (n.RightChild != null && n.RightChild.data == value) 
                    {
                        n.RightChild = temp.RightChild;
                    }
                }
            } else if (temp.RightChild == null) 
            {
                // Case 4. when left child is present and right child becomes null
                
                if (n != null) 
                {
                    if (n.LeftChild.data == value) 
                    {
                        n.LeftChild = temp.LeftChild;
                    } else if (n.RightChild.data == value) 
                    {
                        n.RightChild = temp.LeftChild;
                    }
                }
            } else 
                {
                    // Case 5. when middle node is to be deleted whose both child are present
                    Node pre, post = null;
                    pre = temp.LeftChild;
    
                    if (pre.RightChild == null) 
                    {
                        temp.data = pre.data;
                        temp.LeftChild = pre.LeftChild;
                    } else 
                        {
                            while (pre.RightChild != null) 
                            {
                                post = pre;
                                pre = pre.RightChild;
                            }
                            temp.data = pre.data;
                            if (pre.LeftChild != null) 
                            {
                                post.RightChild = pre.LeftChild;
                            } else 
                                {
                                post.RightChild = null;
                                }
                        }
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
        System.out.print(temp.data + " ");
        //Left node will be called
        Preorder(temp.LeftChild);
        //Right node will be called at last
        Preorder(temp.RightChild);

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
        System.out.print(temp.data + " ");
        //Right node will be called at last
        Inorder(temp.RightChild);

    }

    public static void Postorder(Node temp) 
    {
//if Node value becomes null that means their is no further nodes in the tree so it return.
        if (temp == null) 
        {
            return;
        }

        //Left node will be called firstly
        Postorder(temp.LeftChild);
        //Right node will be called
        Postorder(temp.RightChild);
        //Last time as node will be traversed it will print the value.
        System.out.print(temp.data + " ");

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