class Solution {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return breakint(n,dp);
        
    }
    public static int breakint(int n,int[] dp){
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        int ans=-1;
        for(int i=1;i<n;i++){
            int p=i*Math.max(n-i,breakint(n-i,dp));
            ans=Math.max(ans,p);
        }
        return dp[n]=ans;
    }
}