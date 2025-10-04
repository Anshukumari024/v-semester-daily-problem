class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ls=0;
        for(int i=0;i<k;i++){
            ls+=cardPoints[i];
        }
        int mp=ls;
        int rs=0;
        int j=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            ls-=cardPoints[i];
            rs+=cardPoints[j];
            j--;
            mp=Math.max(mp,ls+rs);
        }
        return mp;
    }
}