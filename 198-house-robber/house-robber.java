class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int ans=rob1(nums,dp,0);
        return ans;
        
    }
    public static int rob1(int[] nums,int[] dp,int i){
        if(i>=nums.length)return 0;

        if(dp[i]!=-1) return dp[i];

        int rob=nums[i]+rob1(nums,dp,i+2);
        int Dontrob=rob1(nums,dp,i+1);
        return dp[i]=Math.max(rob,Dontrob);
    }
}