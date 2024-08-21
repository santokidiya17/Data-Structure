import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public int InputPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 3;

            case '^':
                return 6;

            case '(':
                return 9;

            case ')':
                return 0;

            default:
                return 7;

        }

    }

    public int StackPrecedence(char ch) {

        switch (ch) {
            case '+':
            case '-':
                return 2;

            case '*':
            case '/':
                return 4;

            case '^':
                return 5;

            case '(':
                return 0;

            default:
                return 8;

        }

    }

    public int rank(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return -1;

            case '*':
            case '/':
                return -1;

            case '^':
                return -1;

            default:
                return 1;

        }

    }

    public void postfixNotation(String s) {
        Stack<Character> stack = new Stack<>();
        String polish = "";
        int rank = 0;
        stack.push('(');

        for (int i = 0; i < s.length(); i++) {

            char next = s.charAt(i);

            if (stack.size() < 1) {
                System.out.println("Invalid String");
            }

            while (StackPrecedence(stack.peek()) > InputPrecedence(next)) {
                char temp = stack.pop();
                polish = polish + temp;
                rank = rank + rank(temp);
                if (rank < 1) {

                    System.out.println("Invalid String");

                }

            }
            if (StackPrecedence(stack.peek()) != InputPrecedence(next)) {
                stack.push(next);
            } else {
                stack.pop();
            }

        }
        if (rank != 1) {
            System.out.println("Invalid String");

        } else {
            System.out.println(polish);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix string:");
        String infix = sc.next();
        Postfix s = new Postfix();
        s.postfixNotation(infix);
        sc.close();
    }
}
