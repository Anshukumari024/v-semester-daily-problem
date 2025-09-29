class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        int lo=0;
        int hi=nums1.length;
        int total=(nums1.length+nums2.length);
        int hf=(total+1)/2;
        while(lo<=hi){
            int al=(lo+hi)/2;
            int bl=hf-al;
            int alm1=(al==0)?Integer.MIN_VALUE:nums1[al-1];
            int aleft=(al==nums1.length)?Integer.MAX_VALUE:nums1[al];
            int blm1=(bl==0)?Integer.MIN_VALUE:nums2[bl-1];
            int bleft=(bl==nums2.length)?Integer.MAX_VALUE:nums2[bl];
            if((alm1<=bleft)&& (blm1<=aleft)){
                double ans;
                if(total%2==0){
                    ans=(Math.max(alm1,blm1)+Math.min(aleft,bleft))/2.0;
                }
                else{
                    ans=Math.max(alm1,blm1)/1.0;
                }
                return ans;
            }
            else if(alm1>bleft){
                hi=al-1;
            }
            else if(blm1>aleft){
                lo=al+1;
            }
        }
        return 0.0;
    }
}