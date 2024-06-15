import java.util.*;

public class Lab3_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 1st number:");
        int n = sc.nextInt();
        int sum =0;

        for(int i=0 ; i<=n ; i++){
            sum = sum+i;
        }
        System.out.println("Average:"+(sum/n));
    }
}