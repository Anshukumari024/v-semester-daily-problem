class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        p(nums,list,ll);
        return list;
    }
    public void p(int[] nums,List<List<Integer>> list,List<Integer> ll){
        if(ll.size()==nums.length){
            list.add(new ArrayList<>(ll));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(ll.contains(nums[i])) continue;
            ll.add(nums[i]);
            p(nums,list,ll);
            ll.remove(ll.size()-1);
        }
    }
}