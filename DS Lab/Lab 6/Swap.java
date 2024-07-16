import java.util.*;

public class Swap {

    static void swapNumber(int a , int b){
        int temp = a;
        a = b;
        b= temp;
        System.out.println("a="+a+"b="+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        swapNumber(a, b);

        sc.close();
    }
}
