import java.util.Arrays;
import java.util.Scanner;

public class Input_Output_2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of rows you want in 2D array:");
//        int rows = in.nextInt();
        int[][] arr2D = new int[3][3];
        System.out.println("Number of rows present in 2D Array: "+arr2D.length);

        for (int row = 0; row < arr2D.length; row++) {
//            for each column inside a row
            for (int col=0; col<arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

//        for (int row=0; row < arr2D.length; row++) {
//            for (int col=0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col]+" ");
//            }
//            System.out.println();
//        }
//          using toString method.
        for (int row=0; row<arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }
//       ENHANCED FOR LOOP - using toString method.
        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
