class Solution {
    public int maxFreqSum(String s) {
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars);            
        String str = new String(chars);
        int oc=0;
        int ec=0;
        int om=0;
        int em=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                if(i==0) ec++;
                else{
                    if(ch==str.charAt(i-1)){
                        ec++;
                    }
                    else{
                        ec=1;  
                    }
                }
                em=Math.max(em,ec);
            }
            else{
                if(i==0) oc++;
                else{
                    if(ch==str.charAt(i-1)){
                        oc++;
                    }
                    else{
                        oc=1;
                    }
                }
                om=Math.max(oc,om);
            }


        }
        return em+om;
    }
}