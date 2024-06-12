import java.util.*;

public class Lab1_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
        double area = (Math.PI)*r*r;
        System.out.println("Area of the circle:"+area);
    }
}