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
