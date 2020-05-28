/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/28 20:14
 */
public class BSTree {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node root = null;

    public boolean insert(int val) {
        Node node = new Node(val);
        if(root == null) {
            root = node;
            return true;
        }

        Node cur = root;
        Node parent = null;

        while (cur != null) {
            if (cur.val == val) {
                return false;
            }else if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        //cur为空  位置找到  进行插入
        //两种情况-》
        if (parent.val < val) {
            parent.right = node;
        }else {
            parent.left = node;
        }
        return true;
    }
}

