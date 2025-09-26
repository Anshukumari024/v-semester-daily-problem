class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=search(nums,target);
        int r=search(nums,target+1);
        if(l==r){
            return new int[] {-1,-1};
        }
        else{
            return new int[] {l,r-1};
        }

    }
    public static int search(int[] arr,int t){
        int result=-1;
        int l=0;
        int h=arr.length;
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=t){
                h=mid;
            }
            else{
                l=mid+1;
            }
               
        }
        return h;
    }
}