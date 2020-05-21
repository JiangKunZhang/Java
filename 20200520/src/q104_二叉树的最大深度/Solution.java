package q104_二叉树的最大深度;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/20 20:34
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

}

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
