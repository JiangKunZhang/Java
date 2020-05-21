package q101_对称二叉树;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/20 20:52
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricChild(root.left,root.right);
    }
    public boolean isSymmetricChild(TreeNode left,TreeNode right) {
        if (left == null && right == null) return true;
        if ((left == null && right != null) || (left != null && right == null)) return false;
        return (left.val == right.val) && isSymmetricChild(left.left,right.right) && isSymmetricChild(left.right,right.left);
    }
}
