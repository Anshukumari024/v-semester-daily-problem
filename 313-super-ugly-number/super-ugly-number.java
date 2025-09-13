class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] dp=new long[n];
        int[] idx=new int[primes.length];
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<idx.length;j++){
                dp[i]=Math.min(dp[i],dp[idx[j]]*primes[j]);
            }

            for(int j=0;j<idx.length;j++){
                if(dp[i]==dp[idx[j]]*primes[j]){
                    idx[j]++;
                }
            }
        }
        return (int)dp[n-1];
        
    }
}