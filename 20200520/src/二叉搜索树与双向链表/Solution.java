package 二叉搜索树与双向链表;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/21 16:45
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

    public TreeNode prev = null;//定义前驱节点
    //采用中序遍历将二叉搜索树变成双向链表
    public void ConvertChild(TreeNode pRootOfTree) {
        if (pRootOfTree == null)  {
            return;
        }
        ConvertChild(pRootOfTree.left);
        pRootOfTree.left = prev;//改变左边
        if (prev != null) {//第一次不用改变右
            prev.right = pRootOfTree;//改变右边
        }
        prev = pRootOfTree;//前驱往后走
        ConvertChild(pRootOfTree.right);
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        ConvertChild(pRootOfTree);//改变结构
        TreeNode head = pRootOfTree;//找头节点
        while (head.left != null) {//左不为空，一直往左走
            head = head.left;
        }
        return head;
    }
}
