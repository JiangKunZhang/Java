package 判断是不是完全二叉树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/20 22:33
 */

class Node {
    int val;
    Node left;
    Node right;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node left,Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    boolean isCompleteTree(Node root) {
        Queue<Node> queue = new LinkedList<>();
        Node cur = root;
        queue.offer(cur);
        while (!queue.isEmpty()) {
            cur = queue.poll();
            if (cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }
        while (!queue.isEmpty()) {
            Node cur2 = queue.peek();
            if (cur2 != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }
}
