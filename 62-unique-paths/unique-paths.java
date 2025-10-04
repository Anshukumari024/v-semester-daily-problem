class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1; 
            }
        }
        return path(m, n, 0, 0, dp);
    }
    public int path(int m, int n, int r, int c, int[][] dp) {
        if(r == m - 1 && c == n - 1) return 1;
        if(r >= m || c >= n) return 0;
        if(dp[r][c] != -1) return dp[r][c];
        int right = path(m, n, r, c + 1, dp);
        int down  = path(m, n, r + 1, c, dp);
        dp[r][c] = right + down;
        return dp[r][c];
    }
}
