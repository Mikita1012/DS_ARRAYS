import java.util.*;

//Given an array candies representing the number of candies each
// kid has and an integer extraCandies, where extraCandies represents the
// extra candies that you have, you need to determine if there is a way to
// distribute the extra candies to the kids such that they can have the
// greatest number of candies among all the kids.
public class Kids_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the Maximum Number of Candies
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Step 2: Check for Greatest Number of Candies
        ArrayList<Boolean> result = new ArrayList<>(10);

        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}

