import java.util.*;

public class CaseConverterC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String result = "";
        // String s = sc.nextLine();
        // String r="";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {

                result += Character.toUpperCase(c);

            } else if (Character.isUpperCase(c)) {

                result += Character.toLowerCase(c);

            } else {
                result += c;
            }
        }
        System.out.println("Converted string: " + result);
        sc.close();
    }
}