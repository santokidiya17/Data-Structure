import java.util.*;

public class Lab1_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int r = sc.nextInt();
        int fact=1;

        for(int i =1; i<=r ; i++){
            fact = fact*i;
        }
        System.out.println(fact);

    sc.close();

    }   
}