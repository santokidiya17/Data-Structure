import java.util.Scanner;

public class Replace_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the value of array:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number number you want to replace from the array:");
        int m = sc.nextInt();

        System.out.println("Enter the number number you want to replace with from the array:");
        int l = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (a[i] == m) {
                a[i] = l;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }

        sc.close();

    }
}
