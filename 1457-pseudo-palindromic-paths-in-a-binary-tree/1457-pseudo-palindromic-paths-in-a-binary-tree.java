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
    int res=0;
    public void check(TreeNode root,HashSet<Integer> nodes){
        if(root==null)
            return;
        if(nodes.contains(root.val)){
            nodes.remove(root.val);
        }
        else{
            nodes.add(root.val);
        }
        if(root.left==null && root.right==null){
            if(nodes.size()<=1)
                res++;
        }
        check(root.left, new HashSet(nodes));
        check(root.right, new HashSet(nodes));
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        HashSet<Integer> set=new HashSet<>();
        check(root,set);
        return res;
    }
}