import java.util.*;

public class Insert_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the value of array:");

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value you want to insert:");
        int m = sc.nextInt();

        System.out.println("------------------------------");
        int temp = n+1;

        int arr[] = new int[temp];
        int i = 0;

        while(i < n && a[i] < m)
        {
            arr[i] = a[i];
            i++;
        }

        arr[i] = m;

        for(int j=i+1;j<temp;j++)
        {
            arr[j] = a[j-1];
        }


        for(int k=0; k<temp; k++){
            System.out.println(arr[k]);
        }

        sc.close();
    }
}
