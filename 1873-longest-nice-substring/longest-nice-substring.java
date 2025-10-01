class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2) return "";
        boolean[] u=new boolean[26];
        boolean[] l=new boolean[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                l[ch-'a']=true;
            }
            else{
                u[ch-'A']=true;
            }
        }

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=Character.toLowerCase(ch)-'a';
            if(u[idx]!=l[idx]){
                String left=longestNiceSubstring(s.substring(0,i));
                String right=longestNiceSubstring(s.substring(i+1));
                return left.length()>=right.length()?left:right;
            }
        }
        return s;
        
    }
}