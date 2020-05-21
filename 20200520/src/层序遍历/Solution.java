package 层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/20 22:39
 */

class Node {
    int val;
    Node left;
    Node right;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Solution {
    List<List<Integer>> levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)  return list;
        Node cur = root;
        queue.offer(cur);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            while (size>0) {
                cur = queue.poll();
                if (cur != null) {
                    System.out.print(cur.val + " ");
                    temp.add(cur.val);
                    if (cur.left != null) {
                        queue.offer(cur.left);
                    }
                    if (cur.right != null) {
                        queue.offer(cur.right);
                    }
                }
                size--;
            }
            list.add(temp);
        }
        return list;
    }
}
