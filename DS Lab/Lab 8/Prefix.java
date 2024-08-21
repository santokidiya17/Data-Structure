import java.util.Scanner;
import java.util.Stack;

public class Prefix {
    public int InputPrecedence(char ch) {
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
                return 1;

            case '*':
            case '/':
                return 3;

            case '^':
                return 6;

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
            case '*':
            case '/':
            case '^':
                return -1;
            default:
                return 1;

        }

    }

    public void prefixNotation(String s) {
        Stack<Character> stack = new Stack<>();
        s += ')';
        String polish = "";
        String prefix = ""; 
        int rank1 = 0;
        stack.push('(');

        for (int i = 0; i < s.length(); i++) {

            char next = s.charAt(i);

            if (stack.size() < 1) {
                System.out.println("Invalid String 1");
                return;
            }

            while (StackPrecedence(stack.peek()) > InputPrecedence(next)) {
                char temp = stack.pop();
                polish = polish +temp;
                rank1 += rank(temp);
                System.out.println(rank1);
                if (rank1 < 1) {

                    System.out.println("Invalid String 2");
                    return;
                }

            }
            if (StackPrecedence(stack.peek()) != InputPrecedence(next)) {
                stack.push(next);
            } else {
                stack.pop();
            }

        }
        if (rank1 != 1) {
            System.out.println("Invalid String 3");
            return;

        } else {
            for ( int i = polish.length()-1; i>=0 ; i--){
                    prefix = prefix + polish.charAt(i);
            }
        }
        System.out.println(prefix);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix string:");
        String infix = sc.next();
        Prefix s = new Prefix();
        String infix_reverse = ""; 
        int j = infix.length()-1;
        for ( int i = j; i>=0 ; i--){
            if (infix.charAt(i) == '(') {
                char a = infix.charAt(i);
                a = ')'; 
                infix_reverse = infix_reverse + a;
            }else if(infix.charAt(i) == ')'){
                char b = infix.charAt(i);
                b = '(';
                infix_reverse = infix_reverse + b;
            }else{
                infix_reverse = infix_reverse + infix.charAt(i);
            }
        }
        System.out.println(infix_reverse);
        s.prefixNotation(infix_reverse);
        sc.close();
    }
}
