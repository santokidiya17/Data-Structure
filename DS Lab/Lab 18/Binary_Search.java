import java.util.Scanner;

public class Binary_Search {
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

        int l = 0;
        int r = n-1;
        
        while (l <= r) {
            int middle = (l+r)/2;

            if(key == arr[middle]){
                System.out.println(middle);
                break;
            }else if (key > arr[middle]) {
                l = middle+1;
            }else{
                r = middle-1;
            } 
        }
        sc.close();
    }
}
