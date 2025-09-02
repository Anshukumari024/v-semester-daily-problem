class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); 
            }
            return Integer.compare(a[0], b[0]); 
        });
        
        int ans = 0;
        for (int i = 0; i < points.length; i++) {
            int m = Integer.MIN_VALUE;
            for (int j = i + 1; j < points.length; j++) {
                if (points[i][1] >= points[j][1] && points[j][1] > m) {
                    ans++;
                    m = points[j][1];
                }
            }
        }
        return ans;
    }
}
