class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int area=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int h=heights[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    area=Math.max(h*r,area);
                }
                else{
                    int l=st.peek();
                    area=Math.max(area,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=heights.length;
        while(!st.isEmpty()){
            int h=heights[st.pop()];
            if(st.isEmpty()){
                area=Math.max(area,h*r);
            }
            else{
               int  l=st.peek();
               area=Math.max(area,h*(r-l-1));
            }
        }
        return area;
    }
}