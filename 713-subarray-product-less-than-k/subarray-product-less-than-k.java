class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

       int p=1;
      int l=0;
      int r=0;
      int ml=0;
      while(r<nums.length){
        p*=nums[r];
        while(p>=k){
            p=p/nums[l];
            l++;
        }
        ml+=(r-l+1);
        r++;
      }
      return ml;
    }
}