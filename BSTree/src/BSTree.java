/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/29 7:49
 */
public class BSTree {
    //定义内部类Node是节点
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    //定义一个根节点
    Node root = null;

    /**
     * 插入
     * @param val
     * @return true 表示插入成功， false 表示插入失败
     */
    public boolean insert(int val) {
        Node node = new Node(val);
        if (root == null) {
            this.root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;//需要保存cur的父亲节点，找到位置插入到父亲节点的后面
        while (cur != null) {
            if (cur.val < val) {//在右子树
                parent = cur;
                cur = cur.right;
            }else {//在左子树
                parent = cur;
                cur = cur.left;
            }
        }
        //cur为空  位置找到  进行插入
        //两种情况 在parent 的 左 或者 右
        //已经知道parent的位置 比较大小后插入
        if (parent.val < val) {//在右边
            parent.right = node;
        }else {//在左边
            parent.left = node;
        }
        return true;
    }

    //前序遍历
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //中序遍历
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    /**
     * 在搜索树中查找val
     * @param val
     * @return Node 表示找到， null表示没找到
     */
    public Node search(int val) {
        if (root == null) {
            return null;
        }
        Node cur = root;
        while (cur != null) {
            if (cur.val == val) {
                return cur;
            }else if (cur.val < val) {
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }

    /**
     * 删除
     * @param key
     * @return true 删除成功， false 删除失败
     */
    public boolean remove(int key) {
        Node parent = null;//需要父亲节点
        Node cur = root;//这是要删除的节点
        while (cur != null) {
            if (cur.val == key) {//找到要删除的节点了
                doRemove(parent,cur);//执行删除操作
                return true;
            }else if (cur.val < key) {//在右边找
                parent = cur;
                cur = cur.right;
            }else {//在左边找
                parent = cur;
                cur = cur.left;
            }
        }
        return false;
    }

    //实现操作
    public void doRemove(Node parent, Node cur) {
        //分三种情况 cur的左为空 cur的右为空 cur的左右都不空
        if (cur.left == null) {//cur的左为空
            //分三种情况 cur是根节点 cur是parent的左 cur是parent的右
            if (cur == root) {
                root = cur.right;
            }else if (cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if (cur.right == null) {//cur的右为空
            //分三种情况 cur是根节点 cur是parent的左 cur是parent的右
            if (cur == root) {
                root = cur.left;
            }else if (cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {//cur的左右都不为空
            //当cur都不为空的时候，实现删除的思路有两种
            //1.在左边找最大值target，替换cur，把target删除
            //2.在右边找最小值target，替换cur，把target删除
            //这里采用第二种，在右子树找最小值
            Node targetParent = cur;//记录好父亲节点
            Node target = cur.right;//把target的值赋给cur，实际删除target，替罪羊节点
            while (target.left != null) {//最小值一定是在左边
                targetParent = target;
                target = target.left;
            }
            //进行赋值
            cur.val = target.val;
            //找到的最小值有两种情况
            //1.target是targetParent是左孩子，就是targetParent的左不为空
            //2.target是targetParent是右孩子，就是target的左为空
            //因为是找最小值，所以target的左一定是空
            //让targetParent的左或者右 指向 target的右
            if (target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }

}
