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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        int fromRoot = pathSum(root, targetSum, 0);
        int fromLeft = pathSum(root.left, targetSum);
        int fromRight = pathSum(root.right, targetSum);
        return fromRoot + fromLeft + fromRight;
        
    }
    public int pathSum(TreeNode root, int targetSum,double totalsum) {
        if(root==null)
         return 0 ;
        totalsum+=root.val;
        int count=0;
        if(totalsum==targetSum)
         count++;
        count+=pathSum( root.left, targetSum, totalsum);
        count+=pathSum( root.right, targetSum, totalsum);
        return count;
        
    }
}
