import java.util.Scanner;

public class Count_Negative_Nodes_In_BinaryTree_From_Inorder{


    static int sum = 0;

    public static void main(String[] args) {
        int array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Nodes ");
        int n = sc.nextInt();
        array = new int[n];
        System.out.println("Enter Inorder of Binary Tree ");
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }

        Node node = create_Tree(array, 0, n - 1);
        System.out.println("Total Negative Nodes are  ");
        Count_Negative(node);
        System.out.print(sum);

    }

    public static Node create_Tree(int array[], int start, int end) {

        if (start > end)
            return null;
        int max = min_Finder(array, start, end);
        Node n = new Node(array[max]);

        n.left = create_Tree(array, start, max - 1);
        n.right = create_Tree(array, max + 1, end);

        return n;
    }

    public static int min_Finder(int array[], int start, int end) {

        int min = start;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }

    public static void Count_Negative(Node temp) {

        if (temp == null) {
            return;
        }

        Count_Negative(temp.left);
        Count_Negative(temp.right);

        if (temp.data < 0) {
            sum++;
        }
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