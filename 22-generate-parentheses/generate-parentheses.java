class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        p(list,0,0,"",n);
        return list;
        
    }
    public void p(List<String> list,int o,int c,String ans,int n){
        if(o==n && c==n){
            list.add(ans);
            return;
        }
        if(o>n || c>o) return;
        p(list,o+1,c,ans+"(",n);
        p(list,o,c+1,ans+")",n);
    }
}