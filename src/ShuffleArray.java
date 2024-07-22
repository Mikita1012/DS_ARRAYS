import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in an array :");
        int noOfElements = scan.nextInt();
        int[] arr = new int[noOfElements];


        System.out.println("Enter your elements: ");
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = scan.nextInt();
        }
        int n = arr.length / 2;


        System.out.println("Array before shuffle: "+ Arrays.toString(arr));
        System.out.println("Array after shuffle: "+Arrays.toString(shuffleArray(arr, n)));

    }

    public static int[] shuffleArray(int[] arr, int n) {
        int[] result = new int[2*n];
        int count = 0;

        for (int i=0; i<n; i++) {
            result[count] = arr[i];
            result[count+1] = arr[i+n];
            count += 2;
        }

        return result;
    }
}
