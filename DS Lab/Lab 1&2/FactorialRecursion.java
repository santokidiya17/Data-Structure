import java.util.*;

public class Lab1_5 {
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);

        sc.close();

    }
}