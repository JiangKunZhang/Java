package q106_从中序与后序遍历序列构造二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/19 20:07
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public int postIndex = 0;
    public TreeNode buildTreeChild(int[] inOrder, int[] postOrder,int inBegin,int inEnd) {
        if (inBegin > inEnd) return null;
        TreeNode root = new TreeNode(postOrder[postIndex]);
        int rootIndex = findIndexOfInorder(inOrder,inBegin,inEnd,postOrder[postIndex]);
        postIndex--;
        if (rootIndex == -1) return null;
        root.right = buildTreeChild(inOrder,postOrder,rootIndex+1,inEnd);
        root.left = buildTreeChild(inOrder,postOrder,inBegin,rootIndex-1);

        return root;
    }

    public int findIndexOfInorder(int[] inOrder, int inBegin, int inEnd, int val) {
        for (int i = inBegin; i <= inEnd; i++) {
            if (inOrder[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) return null;
        if (inorder.length <= 0 || postorder.length <= 0) return null;
        postIndex = inorder.length - 1;
        return buildTreeChild(inorder,postorder,0,inorder.length-1);
    }
}
