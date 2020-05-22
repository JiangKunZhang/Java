package q145_二叉树的后序遍历;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/22 0:09
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }



    
}

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur.left);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                cur = stack.pop();
                list.add(cur.val);
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
        return list;
    }
}
