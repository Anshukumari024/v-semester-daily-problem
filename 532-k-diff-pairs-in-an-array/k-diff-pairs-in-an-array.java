class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; 
        HashMap<Integer, Pair> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new Pair(i, 1));
            } else {
                Pair p = map.get(nums[i]);
                p.count++;
            }
        }
        int res = 0;
        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num).count >= 2) res++;
            } else {
                if (map.containsKey(num + k)) res++;
            }
        }
        
        return res;
    }
}
class Pair {
    int index;  
    int count;   

    public Pair(int index, int count) {
        this.index = index;
        this.count = count;
    }
}
