import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the value of array:");

        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value you want to delete:");
        int index = sc.nextInt();

        System.out.println("------------------------------");
        int temp = size-1;

        int arr[] = new int[temp];

        // for(int j=0; j<temp; j++){
        //     if(a[j] < index){
        //         arr[j] = a[j];
        //      }else if(j >= index){
        //         arr[j] = a[j+1];
        //     }
        //     System.out.println(arr[j]);
        // }

        int k =0;
        for(int i=0;i<a.length;i++){
            if(index==a[i]){
                continue;
            }else{
                arr[k]=a[i];
                k++;
            }
        }
        for(int j=0; j<temp; j++){
            System.out.println(arr[j]);
        }

        sc.close();
    }
}
