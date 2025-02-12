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
        if (root == null) {
            return null;
        }
        Queue<Node> levelNodes = new LinkedList<>();
        levelNodes.add(root);
        while (!levelNodes.isEmpty()) {
            int size = levelNodes.size();
            Node previous = null;
            for (int i = 0; i < size; i++) {
                Node current = levelNodes.poll();
                if (previous != null) {
                    previous.next = current;
                }
                previous = current;
                if (current.left != null)
                    levelNodes.offer(current.left);
                if (current.right != null)
                    levelNodes.offer(current.right);

            }
        }

        return root;
    }
}
