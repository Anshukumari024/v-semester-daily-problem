class Solution {
    int c=0;
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int no=0;
        int ro=0;
        int col=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) no++;
                else if(grid[i][j]==1){
                    ro=i;
                    col=j;
                }
            }
        }
        no++;
        int co=0;
        path(grid,ro,col,no,co);
        return c;
    }
    public void path(int[][] grid,int i,int j,int no,int co){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==-1) return;
        if(grid[i][j]==2){
            if(co==no){
                c++;
            }
            return;
        }

        grid[i][j]=-1;
        path(grid,i+1,j,no,co+1);
        path(grid,i-1,j,no,co+1);
        path(grid,i,j+1,no,co+1);
        path(grid,i,j-1,no,co+1);
        grid[i][j]=0;
        
    }
}