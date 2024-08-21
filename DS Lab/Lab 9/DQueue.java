
import java.util.Scanner;

class Queue_Operation {
    int front = -1;
    int rear = -1;
    int n;
    int[] arr;

    public Queue_Operation(int n) {
        arr = new int[n];
        this.n = n;
    }

    public void insertRear(int x) {
        if (rear >= (n - 1)) {
            System.out.println("QUEUE OVERFLOW!!");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = rear + 1;
        arr[rear] = x;
        return;
    }

    public int deleteFront() {
        if (front == -1) {
            System.out.println("QUEUE UNDERFLOW!!");
            return -1;
        }
        int x = arr[front];
        if (front == rear) {
            front = rear = -1;
            return x;
        }
        front = front + 1;
        return x;
    }

    public void insertFront(int x) {
        if (front == 0 && rear == n - 1) {
            System.out.println("QUEUE OVERFLOW!!");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            front = front - 1;
        }
        arr[front] = x;
        return;
    }

    public int deleteRear() {
        if (rear == -1) {
            System.out.println("QUEUE UNDERFLOW!!");
            return -1;
        }
        int x = arr[rear];
        if (front == rear) {
            front = rear = -1;
            return x;
        }
        rear--;
        return x;
    }

    public void display() {
        if (front == -1) {
            System.out.println("QUEUE UNDERFLOW!!");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class DQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of queue:");
        int n = sc.nextInt();
        Queue_Operation q = new Queue_Operation(n);

        System.out.println("1. Insert at rear");
        System.out.println("2. Delete at front");
        System.out.println("3. Insert at front");
        System.out.println("4. Delete at rear");
        System.out.println("5. Display");
        System.out.println("6. Exit");

        boolean ans = true;
        while (ans) {
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch ((choice)) {
                case 1:
                    System.out.println("Enter the Element to be inserted:");
                    int x = sc.nextInt();
                    q.insertRear(x);
                    break;
                case 2:
                    int a = q.deleteFront();
                    if (a != -1) {
                        System.out.println("Deleted element is =" + a);
                    }
                    break;
                case 3:
                    System.out.println("Enter the Element to be inserted:");
                    x = sc.nextInt();
                    q.insertFront(x);
                    break;
                case 4:
                    a = q.deleteRear();
                    if (a != -1) {
                        System.out.println("Deleted element is =" + a);
                    }
                    break;
                case 5:
                    q.display();
                    break;
                case 6:
                    ans = false;
                    break;
            }    
        }
        sc.close();
    }
}