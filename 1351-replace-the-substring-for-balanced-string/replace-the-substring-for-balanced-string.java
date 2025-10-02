class Solution {
    public int balancedString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(!map.containsKey('Q')){
             map.put('Q',0);
        }
        if(!map.containsKey('W')){
             map.put('W',0);
        }
        if(!map.containsKey('E')){
             map.put('E',0);
        }
        if(!map.containsKey('R')){
             map.put('R',0);
        }
        int l=0;
        int len=Integer.MAX_VALUE;
        int target=s.length()/4;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.get(ch)-1);
            while(l<s.length() && map.get('Q')<=target && map.get('W')<=target && map.get('E')<=target && map.get('R')<=target){
                map.put(s.charAt(l),map.get(s.charAt(l))+1);
                len=Math.min(len,r-l+1);
                l++;
            }
        }
        return len; 
    }
}