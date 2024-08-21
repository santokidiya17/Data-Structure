import java.util.Scanner;

public class ReverseLinkedList {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    Node first = null;

    void insertFirst(int data) {
        Node n1 = new Node(data);

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
        Node n1 = new Node(data);
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

    public void reverse() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node prev = null;
        Node save = first;
        while (save != null) {
            Node temp = save.link;
            save.link = prev;
            prev = save;
            save = temp;
        }
        first = prev;
        displayList();
    }

    void displayList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ReverseLinkedList ll = new ReverseLinkedList();

        boolean ans = true;
        while (ans) {
            System.out.println("1. Insert an element");
            System.out.println("2. Reverse the linked list");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to insert:");
                    int a = sc.nextInt();
                    ll.insertFirst(a);
                    break;

                case 2:
                    ll.reverse();
                    break;

                case 3:
                    ll.displayList();
                    break;

                case 4:
                    ans = false;
                    break;
            }
        }
        sc.close();
    }
}