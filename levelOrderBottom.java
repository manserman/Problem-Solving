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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        LinkedList<List<Integer>> finalList = new LinkedList<>();
        Queue<TreeNode> levelNodes= new ArrayDeque<>();
        levelNodes.add(root);
        while(!levelNodes.isEmpty()) {
            List<Integer> bufferList = new ArrayList<>();
            int size= levelNodes.size();
            for(int i=0;i<size;i++) {
                TreeNode currentNode = levelNodes.poll();
                bufferList.add(currentNode.val);
                if(currentNode.left != null) {
                    levelNodes.add(currentNode.left);
                }
                 if(currentNode.right != null) {
                     levelNodes.add(currentNode.right);
                }
            }
            finalList.addFirst(bufferList);

        }
        return finalList;
        
    }
}
