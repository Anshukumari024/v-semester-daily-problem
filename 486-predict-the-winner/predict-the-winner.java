class Solution {
    public boolean predictTheWinner(int[] nums) {
        int[][] dp=new int[23][23];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        int n=nums.length;
        int total=Arrays.stream(nums).sum();
        int p1=solve(0,n-1,nums,dp);
        int p2=total-p1;
        if(p1>=p2) return true;
        return false;
    }
    public int solve(int i,int j, int[] nums,int[][] dp){
        if(i>j) return 0;
        if(i==j) return nums[i];
        if(dp[i][j]!=-1) return dp[i][j];
        int take_i=nums[i]+Math.min(solve(i+2,j,nums,dp),solve(i+1,j-1,nums,dp));
        int take_j=nums[j]+Math.min(solve(i+1,j-1,nums,dp),solve(i,j-2,nums,dp));
        return dp[i][j]=Math.max(take_i,take_j);
    }
}