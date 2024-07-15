import java.util.*;

public class Array_duplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean flag = false;

        System.out.println("Enter the value of array:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (flag == true) {
            System.out.println("Duplicate exists");
        } else {
            System.out.println("Duplicate does not exists");
        }

        sc.close();

    }
}