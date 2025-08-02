/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node Root=root;
        while(root!=null){
            Node dummy=new Node(0);
            Node temp=dummy;
            while(root!=null){
                if(root.left!=null){
                    dummy.next=root.left;
                    dummy=dummy.next;
                }
                if(root.right!=null){
                    dummy.next=root.right;
                    dummy=dummy.next;
                }
                root=root.next;
            }
            root=temp.next;

        }
        return Root;
    }
}