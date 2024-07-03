import java.util.*;

public class Lab4_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the value of array:");

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the index where you want to enter the num:");
        int m = sc.nextInt();

        System.out.println("Enter the value you want to insert:");
        int l = sc.nextInt();

        System.out.println("------------------------------");
        int temp = n+1;

        int arr[] = new int[temp];

        for(int j=0; j<temp; j++){
            if(j < m){
                arr[j] = a[j];
            }else if(j == m){
                arr[j] = l;
            }else{
                arr[j] = a[j-1];
            }
        }

        for(int k=0; k<temp; k++){
            System.out.println(arr[k]);
        }

        sc.close();
    }
}
