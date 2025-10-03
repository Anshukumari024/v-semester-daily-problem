class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        // Arrays.sort(nums);
        subset(nums,list,ll,0);
        return list;
        
    }
    public void subset(int[] nums,List<List<Integer>> list,List<Integer> ll,int idx){

        list.add(new ArrayList(ll));
        for(int i=idx;i<nums.length;i++){
            ll.add(nums[i]);
            subset(nums,list,ll,i+1);
            ll.remove(ll.size()-1);
        }
        
    }
}