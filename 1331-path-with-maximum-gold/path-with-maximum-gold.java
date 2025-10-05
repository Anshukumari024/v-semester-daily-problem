class Solution {
    static int res=0;
    public int getMaximumGold(int[][] grid) {
        int m=grid.length;
        
        int n=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans=Math.max(ans,solve(grid,m,n,i,j));
            }
        }
        return ans;
    }
    public int solve(int[][] grid,int m,int n,int r,int c){
        if(r<0 || r>=m || c<0 || c>=n || grid[r][c]==0){
            return 0;
        }
        int temp=grid[r][c];
        grid[r][c]=0;
        int u=solve(grid,m,n,r+1,c);
        int ri=solve(grid,m,n,r,c+1);
        int d=solve(grid,m,n,r-1,c);
        int l=solve(grid,m,n,r,c-1);
        grid[r][c]=temp;
        res=temp+Math.max(Math.max(u,d),Math.max(ri,l));
        return res;
    }
}