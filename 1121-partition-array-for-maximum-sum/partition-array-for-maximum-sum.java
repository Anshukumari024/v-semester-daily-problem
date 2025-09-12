class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return maxSum(arr, k, 0, dp);
    }

    private int maxSum(int[] arr, int k, int idx, int[] dp) {
        if (idx == arr.length) return 0;
        if (dp[idx] != -1) return dp[idx];

        int max = Integer.MIN_VALUE;
        int ans = 0;

       
        for (int j = idx; j < arr.length && j - idx + 1 <= k; j++) {
            max = Math.max(max, arr[j]);
            int len = j - idx + 1;
            ans= Math.max(ans, max * len + maxSum(arr, k, j + 1, dp));
        }
        return dp[idx] = ans;
    }
}
