import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in an array :");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter your elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        concatenation(arr, n);
        concatenation2(arr, n);
    }

    public static void concatenation(int[] arr, int n) {
        int[] result = new int[n*2];

        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
            result[i+n] = arr[i];
        }

        System.out.println("Result array after 1st method of concatenation: "+ Arrays.toString(result));
    }

    public static void concatenation2(int[] arr, int n) {
        int[] result = new int[2*n];

        System.arraycopy(arr, 0, result, 0, n);
        System.arraycopy(arr, 0, result, n, n);

        System.out.println("Result from 2nd method of concatenation: "+Arrays.toString(result));
    }
}
