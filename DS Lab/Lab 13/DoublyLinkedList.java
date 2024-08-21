import java.util.Scanner;

class DoubleLL_Operations {
    class Node {
        int data;
        Node lpter;// prev
        Node rpter;// next

        public Node(int data) {
            this.data = data;
            this.lpter = null;
            this.rpter = null;
        }
    }

    Node L = null;
    Node tail = null;

    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (L == null) {
            L = tail = newNode;
            return;
        }

        newNode.rpter = L;
        L.lpter = newNode;
        L = newNode;
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (L == null) {
            L = tail = newNode;
            return;
        }

        newNode.lpter = tail;
        tail.rpter = newNode;
        tail = newNode;
    }

    void display() {
        Node temp = L;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.rpter;
        }
    }

    void deleteFirst() {
        if (L == null) {
            System.out.println("List is empty");
            return;
        }

        if (L == tail) {
            L = tail = null;
            return;
        }

        L = L.rpter;
        L.lpter = null;
    }

    void deleteLast() {
        if (L == null) {
            System.out.println("List is empty");
            return;
        }

        if (L == tail) {
            L = tail = null;
            return;
        }

        tail = tail.lpter;
        tail.rpter = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoubleLL_Operations ll = new DoubleLL_Operations();
        boolean ans = true;
        while (ans) {
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Display");
            System.out.println("4. Delete at first");
            System.out.println("5. Delete at last");
            System.out.println("6. Exit");
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
                    ll.insertLast(b);
                    break;

                case 3:
                    ll.display();
                    break;

                case 4:
                    ll.deleteFirst();
                    break;

                case 5:
                    ll.deleteLast();
                    break;

                case 6:
                    ans = false;
                    break;
            }
        }
        sc.close();
    }
}
