import java.util.*;
public class Lab1_11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentSum = 0;
            for (int j = 1; j <= i; j++) {
                currentSum += j;
            }
            totalSum += currentSum;
        }
        System.out.println("The sum of the series is: " + totalSum);
        sc.close();
    }
}