public class RichestOfAll {
    public static int maximumWealth(int[][] accounts) {

        int max=0;
        for(int[] custAccount : accounts) {
            int custWealth = 0;
            for(int accBal : custAccount) {
                custWealth += accBal;
            }
            max = Math.max(max, custWealth);

        }


        return max;
    }

    public static void main(String[] args) {
        int[][] accounts;
        accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int result = maximumWealth(accounts);
        System.out.println(result);

    }
}

