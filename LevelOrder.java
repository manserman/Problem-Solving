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
    public List<List<Integer>> levelOrder(TreeNode root) {
         if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> finalList= new ArrayList<>();
        Queue<TreeNode> levelElements= new ArrayDeque<>();
        levelElements.add(root);
        while(!levelElements.isEmpty()){
            List<Integer> buffer= new ArrayList<>();
            int size= levelElements.size();
            while(size > 0 ){
                TreeNode element= levelElements.poll(); 
                buffer.add(element.val);
                if(element.left != null)
                levelElements.add(element.left);
                if(element.right != null)
                levelElements.add(element.right);
                size--;

            }
              finalList.add(buffer);
        
           
        }
        return finalList;
    }
}
