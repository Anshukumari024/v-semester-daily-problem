class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp=new Boolean[10001];
        
      return solve(nums,0,dp);
        
    }
    public boolean solve(int[] nums,int idx,Boolean[] dp){
        if(idx==nums.length-1) return true;
        if(dp[idx]!=null) return dp[idx];
        for(int i=1;i<=nums[idx];i++){
            if(solve(nums,idx+i,dp)) return dp[idx]=true;
        }
        return dp[idx]=false;
    }
}