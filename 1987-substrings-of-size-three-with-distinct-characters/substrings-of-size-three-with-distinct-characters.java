class Solution {
    public int countGoodSubstrings(String s) {
         int count = 0;
        char []ch = s.toCharArray();
        int l = 0,m = 1,r = 2;
        while(r < ch.length){
            if(ch[l] != ch[r] && ch[l] != ch[m] && ch[r] != ch[m]){
                count++;
            }
            l++;
            m++;
            r++;
        }
        return count;
    }
}