class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int l=0;
        for(i=0;i<nums.length && i<=l ;i++){
            l=Math.max(l,i+nums[i]);
        }
        return i==nums.length;
        
    }
}