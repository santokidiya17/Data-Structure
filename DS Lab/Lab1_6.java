import java.util.*;

public class Lab1_6{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number:");
       int n = sc.nextInt();
       System.out.println("Enter the power");
       int p = sc.nextInt();
       int ans =1;
       for(int i =1; i<=p ; i++){
          ans = ans*n;
       }
       System.out.println(ans);
    }
}