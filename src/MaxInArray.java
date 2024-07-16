import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 7, 9, 11};

        System.out.println(max(arr));
        System.out.println("Max Range: "+maxRange(arr, 1, 3));
    }

    static int max(int[] arr)  {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    static int maxRange(int[] arr, int start, int end)  {
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}
