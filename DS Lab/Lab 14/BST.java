import java.util.Scanner;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes to build tree");
        int n = sc.nextInt();

        Node root = null;

        boolean flag = true;
        while (flag) {

            System.out.println("1.Insert");
            System.out.println("2.Search");
            System.out.println("3.Delete");
            System.out.println("4.Exit");

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (n == 0) {
                        System.out.println("Tree is empty");
                    } else {
                        int[] bst = new int[n];
                        for (int i = 0; i < n; i++) {
                            System.out.println("nodes[" + i + "] = ");
                            bst[i] = sc.nextInt();
                        }

                        for (int i = 0; i < bst.length; i++) {
                            root = insert(root, bst[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter you want to search:");
                    int key = sc.nextInt();
                    System.out.println(search(root, key));
                    break;

                case 3:

                    break;
                    
                case 4:
                    flag = false;
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
        sc.close();
    }
}
