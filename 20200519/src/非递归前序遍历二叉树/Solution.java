package 非递归前序遍历二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/19 22:37
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}

public class Solution {

    //递归
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        List<Integer> left = preorderTraversal(root.left);
        list.addAll(left);

        List<Integer> right = preorderTraversal(root.right);
        list.addAll(right);

        return list;
    }

    //非递归
    List<Integer> preOrderTraversalNor1(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {//记得栈不为空也可以弹出，万一这个节点没有左右子节点，还是要弹出
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.val + " ");
                list.add(cur.val);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            cur = top.right;
        }
        return list;
    }
}
