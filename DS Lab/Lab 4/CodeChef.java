import java.util.Arrays;

public class CodeChef {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5}; 
        int[] B = arrayB(A);
        System.out.println("Array B: " + Arrays.toString(B));
    }

    public static int[] arrayB(int[] A) {
        int[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        reverseArray(B);
        return B;
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}