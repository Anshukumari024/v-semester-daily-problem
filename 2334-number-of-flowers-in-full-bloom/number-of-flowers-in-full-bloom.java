class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] start = new int[n];
        int[] end = new int[n];
        
        for (int i = 0; i < n; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int[] ans = new int[people.length];
        
        for (int i = 0; i < people.length; i++) {
            int p = people[i];
            int starts = upperBound(start, p);
            int ends = upperBound(end, p - 1);
            
            ans[i] = starts - ends;
        }
        return ans;
    }
    private int upperBound(int[] arr, int key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= key) l = m + 1;
            else r = m;
        }
        return l;
    }
}
