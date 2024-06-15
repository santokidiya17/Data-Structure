import java.util.*;

public class Lab2_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the value of array:");

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int j=0; j<n; j++){
            System.out.println(a[j]);
        }
    }
}