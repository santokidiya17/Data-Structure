import java.util.*;

public class Lab1_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                flag = false;
                break;
            } else {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();

    }
}