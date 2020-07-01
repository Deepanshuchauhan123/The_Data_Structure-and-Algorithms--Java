import java.util.Scanner;

public class Sum_of_Non_Leaf_Node_From_Inorder{


    public static void main(String[] args) {
        int array[], sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Nodes ");
        int n = sc.nextInt();
        array = new int[n];
        System.out.println("Enter Inorder value Node  ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }

        Node node = create_Tree(array, 0, n - 1);
        System.out.println("Sum of Node Other than Leaf Nodes is  ");
        System.out.print(sum - Add_LeafNodes(node));

    }

    public static Node create_Tree(int array[], int start, int end) {

        if (start > end)
            return null;
        int max = max_Finder(array, start, end);
        Node n = new Node(array[max]);

        n.left = create_Tree(array, start, max - 1);
        n.right = create_Tree(array, max + 1, end);

        return n;
    }

    public static int max_Finder(int array[], int start, int end) {

        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] < array[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int Add_LeafNodes(Node temp) {
//if Node value becomes null that means their is no further nodes in the tree so it return 0.
        if (temp == null) {
            return 0;
        }
        int left, right;
        // if both left and right node of parent node are null then return 1 bcoz its a leaf node.
        if (temp.left == null && temp.right == null) {
            return temp.data;
        }
        left = Add_LeafNodes(temp.left);
        right = Add_LeafNodes(temp.right);
        return (right + left);
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