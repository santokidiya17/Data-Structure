import java.util.*;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[][] = new int[2][2];
        int b[][]= new int[2][2];
        int c[][]= new int[2][2];

        System.out.println("Enter 1st array:");
        for(int i = 0; i<n ; i++){
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd array:");
        for(int i = 0; i<n ; i++){
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition :");
        for(int i = 0; i<n ; i++){
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
