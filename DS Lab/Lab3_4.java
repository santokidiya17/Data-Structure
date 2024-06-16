import java.util.Scanner;

public class Lab3_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minIndex = 0;
        int maxIndex = 0;
        int minValue = numbers[0];
        int maxValue = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Position of the smallest number is: " + (minIndex+1));
        System.out.println("Position of the largest number is: " + (maxIndex+1));
        scanner.close();
    }
}