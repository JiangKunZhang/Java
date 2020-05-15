/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/15 20:12
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();

        // 遍历思路-求结点个数   前序遍历
        binaryTree.getSize1(root);
        System.out.println(BinaryTree.size);

        // 子问题思路-求结点个数
        System.out.println(binaryTree.getSize2(root));

        // 遍历思路-求叶子结点个数
        binaryTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);

        // 子问题思路-求叶子结点个数
        System.out.println(binaryTree.getLeafSize2(root));

    }
}
