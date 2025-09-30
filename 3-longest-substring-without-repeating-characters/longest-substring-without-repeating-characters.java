class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s=="") return 0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            HashMap<String,Integer> map=new HashMap<>();
            int p=i;
            int c=0;
            while(p<s.length()){
                String s1=""+s.charAt(p);
                if(map.containsKey(s1)) break;
                else{
                    map.put(s1,0);
                    c++;
                }
                p++;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}