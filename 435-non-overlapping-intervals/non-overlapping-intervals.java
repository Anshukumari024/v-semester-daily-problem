class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int pre= intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (pre > intervals[i][0]) {
                res++;
            } else {
                pre = intervals[i][1];
            }
        }
        return res;        
    }
}