class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=-1.0;
        int ans=0;
        
        for(int i=0;i<dimensions.length;i++){
           
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            double d=Math.sqrt((l*l)+(b*b));
            if(d>max){
                max=d;
                ans=l*b;
            }
            else if(d==max){
                ans=Math.max(ans,l*b);
            }
        }
        return ans;
        
    }
}