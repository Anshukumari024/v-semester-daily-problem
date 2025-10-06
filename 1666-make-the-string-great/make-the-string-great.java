class Solution {
    public String makeGood(String s) {
        String str=s;
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            char pch=str.charAt(i-1);
            if(Character.toLowerCase(ch) == Character.toLowerCase(pch) && ch!=pch ){
                str=str.substring(0,i-1)+str.substring(i+1);
                i=0;
            }
        }
        return str;
        
    }
}