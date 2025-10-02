class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return cntG(nums,goal)-cntG(nums,goal-1);
        
    }
    public int cntG(int[] nums,int goal){
        if (goal < 0) return 0;

        int l=0;
        int c=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                
                l++;
            }
            c+=(r-l+1);
        }
        return c;
    }
}