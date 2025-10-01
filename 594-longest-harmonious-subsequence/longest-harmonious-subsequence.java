class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]-nums[j]>1){
                j++;
            }
            if(nums[i]-nums[j]==1){
                l=Math.max(l,i-j+1);
            }
        }
        return l;
        
    }
}