import java.util.*;

public class TemperatureConverter {
    public static double celsius(double temp) {
        return ((temp * (9 / 5)) + 32);
    }

    public static double fahrehnit(double temp) {
        return ((temp-32)*(5/9));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For input in celsius enter 1 and input in fahrehnit enter 2");
        int a = sc.nextInt();

        System.out.println("Enter the temperature:");
        double temperature = sc.nextDouble();

        if (a == 1) {
            System.out.println(celsius(temperature));
        } else {
            System.out.println(fahrehnit(temperature));
        }

      sc.close();
    }
}
