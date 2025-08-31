class Solution {
    public int maximumLength(int[] nums) {
        int os=0;
        int es=0;
        for(int e:nums){
            if(e%2==0) es++;
            else os++;
        }
        int ans=0;
        ans=Math.max(es,os);
        int a=1;
        int p=nums[0]%2;
        for(int i=1;i<nums.length;i++){
            int cp=nums[i]%2;
            if(cp!=p){
                a++;
                p=cp;
            }
        }
        ans=Math.max(ans,a);
        return ans;
        
    }
}