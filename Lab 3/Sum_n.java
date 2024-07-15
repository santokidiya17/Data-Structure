import java.util.*;

public class Sum_n{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int m = sc.nextInt();
        
        System.out.println("Enter the 1st number:");
        int n = sc.nextInt();
        int sum =0;

        for(int i=m ; i<=n ; i++){
            sum = sum+i;
        }
        System.out.println("Sum between the given numbers is:"+sum);

        sc.close();
    }
}