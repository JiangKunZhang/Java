package 非递归后序遍历二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/19 23:22
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    //递归
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        List<Integer> left = postorderTraversal(root.left);
        list.addAll(left);

        List<Integer> right = postorderTraversal(root.right);
        list.addAll(right);

        list.add(root.val);

        return list;
    }

    //非递归
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            //不仅仅是cur的右为空才打印根节点，
            //以及右树被打印过了，也要打印根节点
            if (cur.right == null || cur.right == prev) {
                System.out.print(cur.val + " ");
                list.add(cur.val);
                stack.pop();
                prev = cur;
                cur = null;//记得把弹出栈顶后把cur置为空，否则就重复入栈，
            }else {
                cur = cur.right;
            }
        }
        return list;
    }
}
