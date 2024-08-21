import java.util.Scanner;

class Queue_Operation {
    int Q[];
    int r = 0;
    int f = 0;
    int n;

    Queue_Operation(int size) {
        int max = size;
        Q = new int[max];
        n = max;
    }

    public void enqueue(int data) {
        if (r >= n) {
            System.out.println("Queue Overflown");
            return;
        }
        r++;
        Q[r] = data;
        if (f == 0) {
            f = 1;
            return;
        }
    }

    public int dequeue() {
        if (f == 0) {
            System.out.println("Queue Underflown");
            return 0;
        }
        int y = Q[f];

        if (f == r) {
            f = 0;
            r = 0;
        } else {
            f++;
        }
        return y;
    }

    public void display() {
        for (int i = f; i <= r; i++) {
            System.out.println(Q[i]);
        }
    }
}

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue: ");
        int size = sc.nextInt();

        Queue_Operation queue1 = new Queue_Operation(size);
        boolean ans = true;
        while (ans) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to insert:");
                    int a = sc.nextInt();
                    queue1.enqueue(a);
                    break;

                case 2:
                    queue1.dequeue();
                    break;

                case 3:
                    queue1.display();
                    break;

                case 4:
                    ans = false;
                    break;
            }
        }
        sc.close();
    }
}
