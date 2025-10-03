class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        sum(candidates,target,0,ll,list);
        return list;
    }
    public void sum(int[] arr,int t,int idx,List<Integer> ll,List<List<Integer>> list){
        if(t==0){
            list.add(new ArrayList<>(ll));
            return;
        }
        if(t<0) return;

        for(int i=idx;i<arr.length;i++){
            ll.add(arr[i]);
            sum(arr,t-arr[i],i,ll,list);
            ll.remove(ll.size()-1);
        }
    }
}