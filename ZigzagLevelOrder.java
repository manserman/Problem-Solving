/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> finalList = new ArrayList<>();
        boolean inverted = false;
        Queue<TreeNode> levelNodes = new LinkedList<>();
        levelNodes.add(root);
        while (!levelNodes.isEmpty()) {
            List<Integer>  tempList = new LinkedList<>();
            int levelSize = levelNodes.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = levelNodes.poll();
                if (inverted) {
                    tempList.addFirst(temp.val);
                } else {
                    tempList.addLast(temp.val);
                }
                if (temp.left != null) {
                    levelNodes.add(temp.left);
                }
                if (temp.right != null) {
                    levelNodes.add(temp.right);
                }

            }
            inverted = !inverted;
            finalList.add(tempList);
        }
        return finalList;
    }
}
