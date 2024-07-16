import java.util.Arrays;

public class SwapNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("Array before swapping: "+Arrays.toString(arr));
        swap(arr, 1, 4);
    }

    static void  swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


            System.out.println("Array after swapping: "+Arrays.toString(arr));

    }
}
