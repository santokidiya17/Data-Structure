import java.util.Scanner;

class Queue_Operation {
    int Q[];
    int r = -1;
    int f = -1;
    int n;

    Queue_Operation(int size) {
        int max = size;
        Q = new int[max];
        n = max;
    }

    public void enqueue(int data) {
        if (r == (n-1)) {
            r = 0;
        }else{

            r++;
        }
        Q[r] = data;

        // System.out.println("rear"+r);

        if (f == -1) {
            f = 0;
            return;
        }
    }

    public int dequeue() {
        if (f == -1) {
            System.out.println("Queue Underflown");
            return 0;
        }
        int y = Q[f];

        if (f == r) {
            f = 0;
            r = 0;
        }else if(f == n){
            f = 1;
        }else{
            f++;
        }
        return y;
    }

    public void display() {
        if(f < r){
            for (int i = f; i <= r; i++) {
                System.out.println(Q[i]);
            }
        }else if(f > r){
            for(int i = 0; i <= r;i++){
                System.out.println(Q[i]);
            }
            for(int j = f ; j< n;j++){
                System.out.println(Q[j]);
            }
        }
        // for (int i = f; i <=r; i=(i+1)%n) {
        //     System.out.println(Q[i]);
            
        // }
        // System.out.println();
    }
}

public class CQueue {
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
