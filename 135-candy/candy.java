class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
    int[] leftN = new int[n];
    leftN[0]=1;
    for(int i = 1; i < n; i++) {
        if(ratings[i]> ratings[i-1]){
            leftN[i] = leftN[i-1] + 1;
        }
        else {
            leftN[i] = 1;
        }
    }
    int sum = Math.max(leftN[n-1],1);
    int cur = 1;
    for(int i = n-2; i >=0; i--) {
        if(ratings[i]> ratings[i+1]){
            cur = cur + 1;
        }
        else {
            cur = 1;
        }
        sum += Math.max(leftN[i],cur);
    }
    
    return sum;

        
    }
}