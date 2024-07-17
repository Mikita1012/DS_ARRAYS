import java.util.Arrays;
import java.util.Scanner;

public class SmallerThanTheCurrentNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in an array");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" numbers");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Array entered by you:"+ Arrays.toString(nums));
        System.out.println("Smaller than current element in the array "+Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if( j != i && nums[j] < nums[i]) {
                    count++;
                }
                result[i] = count;
            }
            count = 0 ;
        }
        return result;
    }
}
