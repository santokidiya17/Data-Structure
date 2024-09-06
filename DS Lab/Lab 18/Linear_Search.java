import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array:");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search:");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println(i+1);
            }
        }

        sc.close();
    }
}
