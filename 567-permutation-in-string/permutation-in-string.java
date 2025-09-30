class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] fq=new int[26];
        for(int i=0;i<s1.length();i++){
            int idx=s1.charAt(i)-'a';
            fq[idx]++;
        }
        int windsize=s1.length();
        for(int i=0;i<s2.length();i++){
            int winidx=0,idx=i;
            int[] winarr=new int[26];
            while(winidx<windsize && idx<s2.length()){
                winarr[s2.charAt(idx)-'a']++;
                winidx++;
                idx++;
            }
            if(isfreqsame(fq,winarr)){
                return true;
            }
            
        }
        return false;

        
    }
    public static boolean isfreqsame(int[] fq,int[] winarr){
        for(int i=0;i<26;i++){
            if(fq[i]!=winarr[i]) return false;
        }
        return true;
    }
}