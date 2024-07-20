import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in an array :");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter your elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array before summation:"+ Arrays.toString(arr));
        sumOfArray(arr, n);

    }

    public static void sumOfArray(int[] arr, int n) {
        int[] sum = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += arr[i];
            sum[i] = count;
        }

        System.out.println("Array after summation:"+ Arrays.toString(sum));
    }
}
