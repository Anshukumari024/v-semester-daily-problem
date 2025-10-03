class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(candidates);
        sum(0, candidates, target, ans, ll);
        return ans;
    }
    static void sum(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ll) {
        if (target == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ll.add(arr[i]);
            sum(i + 1, arr, target - arr[i], ans, ll);
            ll.remove(ll.size() - 1);
        }
    }
}