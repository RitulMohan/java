public class maxwealth {

    public static void main(String[] args) {

    }

    int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int account = 0; account < ints.length; account++) {
                sum = +ints[account];
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
