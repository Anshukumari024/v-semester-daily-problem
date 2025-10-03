class Solution {
    public String pushDominoes(String dominoes) {
        int[] lcR=new int[dominoes.length()];
        int[] rcL=new int[dominoes.length()];
        for(int i=0;i<dominoes.length();i++){
            char ch=dominoes.charAt(i);
            if(ch=='R'){
                lcR[i]=i;
            }
            else if(ch=='.'){
                if(i>0) lcR[i]=lcR[i-1];
                else lcR[i]=-1;
            }
            else{
                lcR[i]=-1;
            }
        }
        for(int i=dominoes.length()-1;i>=0;i--){
            char ch=dominoes.charAt(i);
            if(ch=='L'){
                rcL[i]=i;
            }
            else if(ch=='.'){
                if(i<dominoes.length()-1) rcL[i]=rcL[i+1];
                else rcL[i]=-1;
            }
            else{
                rcL[i]=-1;
            }
        }
        String str="";
        for(int i=0;i<dominoes.length();i++){
            int dr=Math.abs(i-lcR[i]);
            int lr=Math.abs(i-rcL[i]);

            if(lcR[i]==rcL[i]) str+=".";
            else if(lcR[i]==-1) str+="L";
            else if(rcL[i]==-1) str+="R";
            else if(dr==lr) str+=".";
            else if(dr<lr) str+="R";
            else if(dr>lr) str+="L";
        }
        return str;
    }
}