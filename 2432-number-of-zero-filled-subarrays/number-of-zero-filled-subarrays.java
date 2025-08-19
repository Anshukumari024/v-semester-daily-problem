class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int idx=-1;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) ans+=i-idx;
            else idx=i;
        }
        return ans;

        
    }
}