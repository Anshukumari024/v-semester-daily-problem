class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l=1;
        long r=0;
        int min=Arrays.stream(time).min().getAsInt();
        r=(long)min*totalTrips;
        long ans=r;
        while(l<=r){
            long mid=r+(l-r)/2;
            if(ispos(time,totalTrips,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean ispos(int[] nums,int totalTrips,long t){
        long ct=0;
        for(int num:nums){
            ct+=t/num;
            if (ct >= totalTrips) return true;
        }
        return false;
    }
}
