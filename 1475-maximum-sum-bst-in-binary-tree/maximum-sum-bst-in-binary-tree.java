/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public class isBst{
        boolean isbst = true;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        int sum = 0;
        int ans = 0;
    }
    public int maxSumBST(TreeNode root) {
        return helper(root).ans;
    }
    public isBst helper(TreeNode root){
        if(root == null){
            return new isBst();
        }
        isBst l = helper(root.left);
        isBst r = helper(root.right);
        isBst sp = new isBst();
        sp.min = Math.min(l.min,Math.min(r.min,root.val));
        sp.max = Math.max(l.max,Math.max(r.max,root.val));
        sp.sum = root.val+r.sum+l.sum;
        sp.isbst = l.isbst && r.isbst && l.max < root.val && r.min > root.val;
        if(sp.isbst){
            sp.ans = Math.max(l.ans,Math.max(r.ans,sp.sum));
        }
        else{
            sp.ans = Math.max(l.ans,r.ans);
        }
        return sp;
    }
}