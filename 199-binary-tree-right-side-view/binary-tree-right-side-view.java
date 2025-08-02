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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if (root == null) return list; 
        q.offer(root);
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
                TreeNode node=q.poll();
                if(i==l-1) list.add(node.val);
                if(node.left!=null) {
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        return list;
        
    }
}