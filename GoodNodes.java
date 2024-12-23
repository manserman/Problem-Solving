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
    int n=0;
    public int goodNodes(TreeNode root) {
        goodNode(root, root.val);
        return n;
        
    }
    public void goodNode(TreeNode root,int maxFound){
        if(root==null)
         return;
         if(root.val>=maxFound){
          n++;
          maxFound=root.val;
         }
         goodNode(root.left,maxFound);
         goodNode(root.right,maxFound);
    }
}
