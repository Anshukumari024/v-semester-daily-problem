class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
       int area=0;
       int len=heights.length;
       for(int i=0;i<=len;i++){
        int val=(i==len)?0:heights[i];
        while(!st.isEmpty() && val<heights[st.peek()] ){
            int nsr=i;
            int tbs=st.pop();
            int nsl=st.isEmpty()?-1:st.peek();

            int wdt=nsr-nsl-1;
            area=Math.max(wdt*heights[tbs],area);
        }
        st.push(i);
       }
       return area;
    }
}