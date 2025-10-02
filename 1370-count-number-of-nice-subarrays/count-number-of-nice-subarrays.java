class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return cntG(nums,k)-cntG(nums,k-1);
    }
     public int cntG(int[] nums,int goal){
        if (goal < 0) return 0;

        int l=0;
        int c=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r]%2;
            while(sum>goal){
                sum=sum-nums[l]%2;
                
                l++;
            }
            c+=(r-l+1);
        }
        return c;
    }
}