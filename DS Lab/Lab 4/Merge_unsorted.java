import java.util.*;

public class Merge_unsorted{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr1[] = new int[n];

        System.out.println("Enter the value of array1:");

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of 2nd array:");
        int m = sc.nextInt();

        int arr2[] = new int[n];

        System.out.println("Enter the value of array2:");

        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("------------------------------");
        int temp = n+m;

        int arr[] = new int[temp];

        for(int i =0;i<arr1.length-1;i++){
             
        }

        for(int k=0; k<temp; k++){
            System.out.println(arr[k]);
        }
        sc.close();
    }
}
