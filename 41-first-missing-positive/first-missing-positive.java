class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==1) {
                flag=true;
            }
            if(arr[i]<1 || arr[i]>n){
                arr[i]=1;
            }
        }
        if(!flag) return 1;
        for(int i=0;i<n;i++){
            int num=Math.abs(arr[i]);

            arr[num-1]=-Math.abs(arr[num-1]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0) return i+1;
        }
        return n+1;
    }
}