import java.util.Scanner;

class Node {
    int data;
    Node link;
}

class CIRLinkedList {
    Node first;
    Node last;

    public void insertAtFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            last = newNode;
        }
    }

    public void delete(int idx) {
        Node save=first;
        //Node prev=save;
        int size = 0;
    
        do{
            save = save.link;
            size++;
        }while (save != first);

        int i = 1;
        int findIdx = size - idx;
        Node temp1 = first;

        while (i < findIdx) {
            temp1 = temp1.link;
            i++;
        }

        temp1.link = temp1.link.link;
    }

    public int sizeOFList() {
        int size = 0;
        Node save = first;
        if (save == null) {
            return size;
        }
        do {
            save = save.link;
            size++;
        } while (save != first);
        return size;
    }

    public void display() {
        Node save = first;

        do {
            System.out.println(save.data);
            save = save.link;
        } while (save != first);
    }

    public class CircularLinkedList {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            CIRLinkedList ll = new CIRLinkedList();
            boolean ans = true;
            while (ans) {
                System.out.println("1. Insert at first");
                System.out.println("2. Insert at last");
                System.out.println("3. Size of List");
                System.out.println("4. Delete");
                System.out.println("5. Display");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the element you want to insert:");
                        int a = sc.nextInt();
                        ll.insertAtFirst(a);
                        break;

                    case 2:
                        System.out.println("Enter the element you want to insert:");
                        int b = sc.nextInt();
                        ll.insertAtLast(b);
                        break;

                    case 3:
                        System.out.println("Size of List: " + ll.sizeOFList());
                        break;

                    case 4:
                        System.out.println("Enter the element you want to insert:");
                        int c = sc.nextInt();
                        ll.delete(c);
                        break;

                    case 5:
                        ll.display();
                        break;

                    case 6:
                        ans = false;
                        break;
                }
            }
            sc.close();
        }
    }
}