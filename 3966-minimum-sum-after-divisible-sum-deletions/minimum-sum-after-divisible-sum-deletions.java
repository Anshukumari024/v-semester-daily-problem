class Solution {
    public long minArraySum(int[] nums, int k) {
        long[] dp=new long[k];
        Arrays.fill(dp,Long.MAX_VALUE);
        long sum=0;
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=(int)(sum%k +k)%k;

            sum=Math.min(sum,dp[rem]);
            dp[rem]=Math.min(dp[rem],sum);
        }
        return sum;
    }
}
