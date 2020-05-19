package 非递归中序遍历二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/19 23:00
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode (int val) {
        this.val = val;
    }
}

public class Solution {
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        List<Integer> left = inorderTraversal(root.left);
        list.addAll(left);

        list.add(root.val);

        List<Integer> right = inorderTraversal(root.right);
        list.addAll(right);

        return list;
    }

    //非递归
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            list.add(top.val);
            cur = top.right;
        }
        return list;
    }
}
