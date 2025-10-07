class Solution {
    public int evalRPN(String[] nums) {
        Stack<Integer> st=new Stack<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(isInteger(nums[i])){
                st.push(Integer.parseInt(nums[i]));
            }
            else{
                int b=st.pop();
                int a=st.pop();
                if(nums[i].equals("+")){
                    c=a+b;
                }
                else if(nums[i].equals("-")){
                    c=a-b;
                }
                else if(nums[i].equals("*")){
                    c=a*b;
                }
                else if(nums[i].equals("/")){
                    c=a/b;
                }
                st.push(c);
                
            }
        }
        return st.pop();
        
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s); 
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}