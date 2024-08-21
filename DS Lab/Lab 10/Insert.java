import java.util.Scanner;

class LinkedList {

    class Node {
        int data;
        Node link;
    }

    public Node first = null;

    void insertFirst(int data) {
        Node n1 = new Node();
        n1.data = data;

        if (first == null) {
            // LL is empty
            first = n1;
            return;
        } 
        Node save = first;
        first = n1;
        first.link = save;
    }

    void insertEnd(int data) {
        Node n1 = new Node();
        n1.data = data;
        n1.link = null;
        if (first == null) {
            // LL is empty
            first = n1;
            return;
        } 
        Node temp = first;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = n1;
    }

    void displayList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

    void insertOrder(int data) {
        Node n1 = new Node();
        n1.data = data;
        if (first == null) {
            // LL is empty
            first = n1;
            return;
        } 
        Node save = first;
        if (first == null || first.data >= n1.data) {
            n1.link = first;
            first = n1;
        } else {
            while (save.link != null && save.link.data <= n1.data) {
                save = save.link;
            }
            n1.link = save.link;
            save.link = n1;
        }
    }

    void removeFirst() {
        // int ans = first.data;
        first = first.link;
        // return ans;
    }

    void removeLast() {
        Node pred = first;

        while (pred.link.link != null) {
            pred = pred.link;
        }
        pred.link = null;
    }

    void deletePosition(int idx) {
        int size = 0;
        Node temp = first;

        while (temp != null) {
            temp = temp.link;
            size++;
        }

        int i = 1;
        int findIdx = size - idx;
        Node temp1 = first;

        while (i < findIdx) {
            temp1 = temp1.link;
            i++;
        }

        temp1.link = temp1.link.link;
    }
}

public class Insert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList ll = new LinkedList();
        boolean ans = true;
        while (ans) {
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Insert in order");
            System.out.println("4. Display");
            System.out.println("5. Delete at first");
            System.out.println("6. Delete at last");
            System.out.println("7. Delete at given position");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to insert:");
                    int a = sc.nextInt();
                    ll.insertFirst(a);
                    break;

                case 2:
                    System.out.println("Enter the element you want to insert:");
                    int b = sc.nextInt();
                    ll.insertEnd(b);
                    break;

                case 3:
                    System.out.println("Enter the element you want to insert:");
                    int c = sc.nextInt();
                    ll.insertOrder(c);
                    break;

                case 4:
                    ll.displayList();
                    break;

                case 5:
                    ll.removeFirst();
                    break;

                case 6:
                    ll.removeLast();
                    break;

                case 7:
                    System.out.println("Enter the element you want to delete:");
                    int d = sc.nextInt();
                    ll.deletePosition(d);
                    break;

                case 8:
                    ans = false;
                    break;
            }
        }
        sc.close();
    }
}
