class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m=heightMap.length;
        int n=heightMap[0].length;
        int water =0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        boolean[][] visited = new boolean[m][n];
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m-1 || j == 0 || j == n-1) {
                    pq.offer(new int[]{i, j, heightMap[i][j]});
                    visited[i][j] = true;
                }
            }
        }
        while(!pq.isEmpty()){
            int[] box=pq.poll();
            int x=box[0],y=box[1],h=box[2];
            
            for(int[] dir:directions){
                int x_=x+dir[0];
                int y_=y+dir[1];

                if(x_>=0 && x_<m && y_>=0 && y_<n && !visited[x_][y_]){
                    water+=Math.max(h-heightMap[x_][y_],0);
                    pq.offer(new int[]{x_,y_,Math.max(heightMap[x_][y_],h)});
                    visited[x_][y_]=true;
                }
            }
        }
        return water;

        
    }
}