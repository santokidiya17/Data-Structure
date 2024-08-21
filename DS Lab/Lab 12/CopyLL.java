

import java.util.Scanner;

class LinkedList {
    class Node {
        int data;
        Node link;

        public Node(int data){
            this.data = data;
            this.link = null;
        }
    }

    public Node first = null;

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

     public LinkedList  copyLinkedList(LinkedList ll) {
        
        LinkedList newList = new LinkedList();

        if (first == null) {
            return newList;
        }

        Node save = first;
        newList.first = new Node(save.data);
        Node newCurrent = newList.first;

        while (save.link != null) {
            save = save.link;
            newCurrent.link = new Node(save.data);
            newCurrent = newCurrent.link;
        }
       return newList; 
    }

    void displayList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

}

public class CopyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList ll = new LinkedList();
        boolean ans = true;
        while (ans) {
            System.out.println("1. Insert an element");
            System.out.println("2. Copy the linked list");
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
                    LinkedList copy = ll.copyLinkedList(ll);
                    copy.displayList();
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
