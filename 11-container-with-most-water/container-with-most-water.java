class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int i = 0;
        int j = height.length - 1;
        
        while (i < j) {
            int w = j - i; 
            int h = Math.min(height[i], height[j]); 
            int a = w * h; 
            ans = Math.max(ans, a); 
            
            if (height[i] < height[j]) {
                i++; 
            } else {
                j--; 
            }
        }
        
        return ans;
    }
}