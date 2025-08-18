class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
       long ans=0;
       for(int i=0;i<prices.length;i++){
        ans+=prices[i]*strategy[i];
       }
       long base=ans;
       for(int i=0;i<k;i++){
        base-=prices[i]*strategy[i];
       }
       long cover=0;
       for(int i=k/2;i<k;i++){
        cover+=prices[i];
       }
        ans=Math.max(ans,base+cover);
       for(int i=k;i<prices.length;i++){
        base-=prices[i]*strategy[i];
        base+=prices[i-k]*strategy[i-k];
        cover-=prices[i-k/2];
        cover+=prices[i];
        ans=Math.max(ans,base+cover);
       }
       return ans;
    }
}
