class Solution {
   
    public int rob(int[] nums) {
         int[] dp=new int[nums.length];
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int t1=solve(nums,0,n-2,dp);
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=nums[1];
        int t2=solve(nums,1,n-1,dp);
        return Math.max(t1,t2);
    }
    public int solve(int[] nums, int i,int n,int[] dp){
        for(int idx=2;idx<=n;idx++){
           int rob= nums[idx]+dp[idx-2];
           int notrob=dp[idx-1];
           dp[idx]=Math.max(rob,notrob);
        }
        return dp[n];
    }
}