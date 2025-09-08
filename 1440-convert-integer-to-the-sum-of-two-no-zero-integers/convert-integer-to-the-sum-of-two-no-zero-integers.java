class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=0,b=0;
        for(int i=1;i<n;i++){
           String s=Integer.toString(i);
           String s1=Integer.toString(n-i);
           if(!(s.contains("0") )&& (!s1.contains("0"))){
            a=i;
            b=n-i;
           }
        }
        return new int[] {a,b};
        
    }
}