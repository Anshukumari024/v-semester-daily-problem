class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int l=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            if(map.containsKey(s.charAt(r))){
                int idx=map.get(s.charAt(r));
                if(idx>=l){
                    l=idx+1;
                }
            }
            map.put(s.charAt(r),r);
            maxLength=Math.max(maxLength,r-l+1);
        }
        return maxLength;
        
    }
}