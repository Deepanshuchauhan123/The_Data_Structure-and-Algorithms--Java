import java.util.Scanner;

public class Height_of_BinaryTree_From_Inorder{


    public static void main(String[] args) {
        int array[];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Node node = create_Tree(array, 0, n - 1);
        System.out.print(HeightOf_Tree(node));
    }

    public static Node create_Tree(int array[], int start, int end) {

        if (start > end)
            return null;
        int min = min_Finder(array, start, end);
        Node n = new Node(array[min]);

        n.left = create_Tree(array, start, min - 1);
        n.right = create_Tree(array, min + 1, end);

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

    public static int HeightOf_Tree(Node temp) {
//if Node value becomes null that means their is no further nodes in the tree so it return 0.
        if (temp == null) {
            return 0;
        }
        if (temp.left == null && temp.right == null)
            return 0;

        int left_height, right_height;
        //height of left sub tree and right sub tree is calculated.
        left_height = HeightOf_Tree(temp.left);
        right_height = HeightOf_Tree(temp.right);
        //Returning the maximum of left sub tree or right sub tree.
        return (1 + ((left_height > right_height) ? left_height : right_height));


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