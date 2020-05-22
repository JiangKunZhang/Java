package 二叉搜索树与双向链表;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/21 23:56
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }


}

public class Solution {
    public TreeNode prev = null;
    public TreeNode ConvertChild(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        ConvertChild(pRootOfTree.left);
        pRootOfTree.left = prev;
        if (prev != null) {
            prev.right = pRootOfTree;
        }
        prev = pRootOfTree;
        ConvertChild(pRootOfTree.right);
        return pRootOfTree;
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        TreeNode head = ConvertChild(pRootOfTree);
        while (head.left != null) {
            head = head.left;
        }
        return head;
    }
}
