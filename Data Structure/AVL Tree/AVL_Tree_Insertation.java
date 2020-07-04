/*
AVL Tree::  AVL tree is a self-balancing Binary Search Tree (BST) where the difference between heights 
	 of left and right subtrees cannot be more than one for all nodes.
	
	AVL Tree check Balance factor on each Insertation of Node.
	where,
		Balance factor = (Height of Left sub-Tree) - (Height of Right sub-Tree)

Insertation Time Complexity(TC):
		Insertation = Inserting Element TC ( O(Log n)) + Re-balanceing TC ( O(Log n)) + Rotation TC (Constant)
			 = ( O(Log n))+( O(Log n))+C
			 = ( O(Log n))

Result : :	So, AVL Tree is better than Simple Binary Search Tree.
*/


import java.util.Scanner;

public class AVL_Tree_Insertation{

    public static void main(String[] args)
    {
        AVL_Tree tree = new AVL_Tree();

        System.out.println("Insertation in AVL Tree or Balanced Binary Search Tree");

        Scanner sc = new Scanner(System.in);


        while (true)
        {
            System.out.println("\n1. Add Node to the AVL Tree:");
            System.out.println("2. Preorder Traversal of AVL Tree:");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice:");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter node Data: ");
                    tree.insert(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Pre-Order Traversal is :: ");
                    tree.display();
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter valid choice!!!!");
            }

        }
    }
}

// AVL Tree class
class AVL_Tree
{

    // Creating Root Node as private so that no other class can modify it.
    private Node Root;

    // public insert method called by another class that want to insert data into AVL Tree
    public void insert(int item)
    {
        //THis is our AVL class insert Method is called
        this.Root = insert(this.Root, item);
    }

    // Insert Code is similear as insertation in Binary search Tree
    private Node insert(Node node, int item)
    {
        if (node == null) {
            Node nn = new Node(item);
            return nn;
        }

        if (item > node.data) {
            node.right = insert(node.right, item);
        } else if (item < node.data) {
            node.left = insert(node.left, item);
        }

        // Finding Height of the node
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        //Calculating Balanced factor of the node
        int balance_fac = balancing_Factor(node);

        // LL(Left-Left) Case (Right-Rotate or Clockwise Rotation)
        if (balance_fac > 1 && item < node.left.data)
        {
            return RightRotate_LL(node);
        }

        // RR(Right-Right) Case (Left-Rotate or Counter Clockwise Rotation)
        if (balance_fac < -1 && item > node.right.data)
        {
            return LeftRotate_RR(node);
        }

        // LR(Left-Right) Case ---> Two Rotation
        if (balance_fac > 1 && item > node.left.data)
        {
            node.left = LeftRotate_RR(node.left);
            return RightRotate_LL(node);
        }
        // RL(Right-Left) Case ---> Two Rotation
        if (balance_fac < -1 && item < node.right.data)
        {
            node.right = RightRotate_LL(node.right);
            return LeftRotate_RR(node);
        }

        return node;
    }

    // Height calculation
    private int height(Node node)
    {
        if (node == null)
            return 0;
        return node.height;
    }

    //Balanced Factor Calculation
    private int balancing_Factor(Node node)
    {
        if (node == null)
            return 0;

        return (height(node.left) - height(node.right));
    }


    private Node RightRotate_LL(Node c)
    {
        Node b = c.left;
        Node b_right = b.right;

        //Rotate the Node
        b.right = c;
        c.left = b_right;

        // Now Updating height
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;

        //This is the new Root Node after LL Rotation
        return b;
    }


    private Node LeftRotate_RR(Node c)
    {
        Node b = c.right;
        Node b_left = b.left;

        //Rotate the Node
        b.left = c;
        c.right = b_left;

        // Now Updating height
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;

        //This is the new Root Node after LL Rotation
        return b;
    }

    public void display()
    {
        display_Preorder(this.Root);
    }

    // Display Pre Order of AVL Tree
    private void display_Preorder(Node temp)
    {
        if (temp == null)
        {
            return;
        }

        System.out.print(temp.data + " ");

        //Left node will be called
        display_Preorder(temp.left);

        //Right node will be called at last
        display_Preorder(temp.right);

    }

    // Our Node class
    private class Node
    {
        int data, height;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
            this.height = 1;
        }
    }
}
