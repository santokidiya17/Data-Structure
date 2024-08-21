//import java.util.Scanner;

// class LLQueue_Operation {
//     class Node {
//         int data;
//         Node link;

//         public Node(int data) {
//             this.data = data;
//             this.link = null;
//         }
//     }

//     Node top = null;

//     public void push(int data) {
//         Node newNode = new Node(data);

//         if (top == null) {
//             top = newNode;
//             return;
//         }

//         Node save = top;
//         top = newNode;
//         top.link = save;
//     }

//     public void pop() {

//         if (top == null) {
//             System.out.println("Queue is empty!!!!!");
//         }

//         Node pred = top;

//         while (pred.link.link != null) {
//             pred = pred.link;
//         }
//         pred.link = null;
//     }

//     public void display() {
//         Node temp = top;
//         if (top == null) {
//             System.out.println("Stack is empty");
//             return;
//         }

//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.link;
//         }
//     }

// }

// public class LinkedList_Queue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         LLQueue_Operation queue = new LLQueue_Operation();
//         while (true) {
//             System.out.println("1. PUSH");
//             System.out.println("2. POP");
//             System.out.println("3. DISPLAY");
//             System.out.println("4. EXIT");
//             System.out.println();
//             System.out.print("Enter a choice: ");

//             int n = sc.nextInt();

//             switch (n) {
//                 case 1:
//                     System.out.println("Enter a value to Push: ");
//                     int x = sc.nextInt();
//                     queue.push(x);
//                     break;

//                 case 2:
//                     queue.pop();
//                     break;

//                 case 3:
//                     queue.display();
//                     break;

//                 case 4:
//                     System.out.println("Exited sucessfully.......");
//                     sc.close();
//                     return;

//                 default:
//                     System.out.println("Invalid choice!! try again!!");
//             }
//         }
//     }
// }

class LLQueue_Operation {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.link = newNode;
        tail = newNode;
    }

    public int dequeue(){
        if(head == null && tail == null){
            System.out.println("Queue is empty");
            return -1;
        }

        int front = head.data;
        if(tail == head){
            tail = head = null;
        }else{
            head = head.link;
        }
        return front;
    }

    public void display(){
        Node temp = head;
        if (head == null && tail == null) {
            System.out.println("Queue is empty");
            return;
        }

        while (temp.link != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}

public class LinkedList_Queue {
    public static void main(String[] args) {
        LLQueue_Operation newLL = new LLQueue_Operation();
        newLL.enqueue(1);
        newLL.enqueue(2);
        newLL.enqueue(3);
        newLL.display();
    }
}