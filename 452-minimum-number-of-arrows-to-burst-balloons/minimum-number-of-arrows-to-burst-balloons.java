class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));
        // List<int[]> ll = new ArrayList<>();
        int c=0;
        int x =points[0][0];
        int y =points[0][1];
        int n =points.length;
        for (int i=1;i<n;i++) {
           if(y>=points[i][0]){
            y = Math.min(y,points[i][1]);
           }
           else{
            c++;
            x=points[i][0];
            y=points[i][1];
           }
        }
       c++;
        return c;
    }
} 