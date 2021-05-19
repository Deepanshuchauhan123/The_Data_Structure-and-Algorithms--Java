import java.util.Scanner;

class Forest {

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        int choice, age, id;
        String name;
        float height;
        TreeOperations operations = new TreeOperations();
        while (true) {
            System.out.println("\n Enter your choice");
            System.out.println("0. Plant a Tree");
            System.out.println("1. Display all Trees");
            System.out.println("2. Sort all the Trees by Name");
            System.out.println("3. Search Tree by Name");
            System.out.println("4. Update Tree's height and age by its ID");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Enter tree Id");
                    id = sc.nextInt();
                    System.out.println("Enter tree age");
                    age = sc.nextInt();
                    System.out.println("Enter tree Name");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter tree Height");
                    height = sc.nextFloat();
                    operations.plantTree(id, age, name, height);
                    break;
                case 1:
                    operations.displayAllTrees();
                    break;
                case 2:
                    operations.sortTreesByName();
                    break;
                case 3:
                    System.out.println("Enter Name of Tree ");
                    sc.nextLine();
                    name = sc.nextLine();
                    operations.searchTreesByName(name);
                    break;
                case 4:
                    System.out.println("Enter Tree ID you want to Update");
                    id = sc.nextInt();
                    System.out.println("Enter new Height");
                    height = sc.nextFloat();
                    System.out.println("Enter new age");
                    age = sc.nextInt();
                    operations.updateTreesHeightandAgebyID(id, height, age);
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter a Valid Choice");
            }
        }

    }
}

class Tree {
    int id;
    String name;
    int age;
    float height;
    Tree nextTree;
}

class TreeOperations {
    private Tree head;

    public void plantTree(int id, int age, String name, float height) {
        Tree tree = new Tree();
        tree.id = id;
        tree.name = name;
        tree.age = age;
        tree.height = height;
        tree.nextTree = null;

        if (head == null)
            head = tree;
        else {
            Tree t = head;
            while (t.nextTree != null) {
                t = t.nextTree;
            }
            t.nextTree = tree;
        }
    }


    public void displayAllTrees() {
        Tree tree1 = head;
        if (head == null)
            System.out.println("Forest has no trees;");
        else {
            while (tree1.nextTree != null) {
                System.out.println("Name= " + tree1.name + " Height= " + tree1.height + " ID= " + tree1.id + " Age= " + tree1.age);
                tree1 = tree1.nextTree;
            }
            System.out.println("Name= " + tree1.name + " Height= " + tree1.height + " ID= " + tree1.id + " Age= " + tree1.age);
        }

    }

    public void sortTreesByName() {

        Tree ptr1 = head, ptr2;

        while (ptr1.nextTree != null) {
            ptr2 = ptr1.nextTree;
            boolean value = true;
            while (value) {

                if (ptr2.name.compareTo(ptr1.name) < 0) {
                    System.out.println(ptr2.name + "  >  " + ptr1.name);
                    //swapping elements
                    String name = ptr1.name;
                    ptr1.name = ptr2.name;
                    ptr2.name = name;

                    int id = ptr1.id;
                    ptr1.id = ptr2.id;
                    ptr2.id = id;

                    int age = ptr1.age;
                    ptr1.age = ptr2.age;
                    ptr2.age = age;

                    float height = ptr1.height;
                    ptr1.height = ptr2.height;
                    ptr2.height = height;

                }
                ptr2 = ptr2.nextTree;
                if (ptr2 == null)
                    value = false;
            }
            ptr1 = ptr1.nextTree;
        }
        displayAllTrees();
    }

    public void searchTreesByName(String givenName) {
        int count = 0, temp = 0;
        Tree tree = head;
        if (head == null)
            System.out.println("No Tree in the Forest");
        else {
            while (tree.nextTree != null) {

                if (tree.name.equals(givenName)) {
                    temp = 1;
                    System.out.println("Tree is at " + count + " Position in the Forest");
                }
                tree = tree.nextTree;
                count++;
            }
            if (tree.name.equals(givenName)) {
                temp = 1;
                System.out.println("Tree is at " + count + " Position in the Forest");
            }
            if (temp == 0)
                System.out.println("No Tree is present in the Forest with this name");
        }
    }

    public void updateTreesHeightandAgebyID(int id, float height, int age) {
        Tree tree = head;
        if (head == null)
            System.out.println("No Tree in the Forest");
        else {
            while (tree.nextTree != null) {
                if (tree.id == id) {
                    tree.age = age;
                    tree.height = height;
                }
                tree = tree.nextTree;
            }
            if (tree.id == id) {
                tree.age = age;
                tree.height = height;
            }
        }
    }
}