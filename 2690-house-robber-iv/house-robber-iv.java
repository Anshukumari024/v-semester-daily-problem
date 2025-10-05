class Solution {
    public int minCapability(int[] nums, int k) {
        int l=Arrays.stream(nums).min().getAsInt();
        int r=Arrays.stream(nums).max().getAsInt();
        while(l<r){
            int mid=l+(r-l)/2;
            if(isposs(nums,k,mid)){
                r=mid;

            }
            else{
                l=mid+1;
            }
        }
        return r;
    }
    public boolean isposs(int[] nums,int k,int cap){
        int h=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]<=cap){
                h++;
                i+=2;
            }
            else{
                i++;
            }
        }
        return h>=k;
    }
}