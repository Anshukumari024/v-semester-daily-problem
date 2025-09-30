class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int m=grid.length;
       int n=grid[0].length;
       int[][] temp=new int[m][n];
       List<List<Integer>> list=new ArrayList<>();
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            int idx=((i*n+j)+k)%(m*n);
            int nr=idx/n;
            int nc=idx%n;
            temp[nr][nc]=grid[i][j];
        }
       }
       for(int i=0;i<m;i++){
        List<Integer> ll=new ArrayList<>();
        for(int j=0;j<n;j++){
            ll.add(temp[i][j]);
        }
        list.add(ll);
       }
        
       return list;
    }
}