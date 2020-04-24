/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/20 20:00
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //测试头插
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        //打印链表
        myLinkedList.display();
        System.out.println();
        //测试尾插
        myLinkedList.addLast(14);
        myLinkedList.addLast(14);
        myLinkedList.addLast(14);
        myLinkedList.addLast(17);
        myLinkedList.display();
        System.out.println();
        //测试包含关键字contains
        System.out.println(myLinkedList.contains(12));
        System.out.println(myLinkedList.size());
        //测试在任意位置插入
        myLinkedList.addIndex(0,14);
        myLinkedList.display();
        System.out.println();
        myLinkedList.addIndex(9,14);
        myLinkedList.display();
        System.out.println();
        myLinkedList.romove(17);
        myLinkedList.display();
        System.out.println();
        myLinkedList.romoveAllKey(14);
        myLinkedList.display();
        System.out.println();
        System.out.println(myLinkedList.middleNode().data);
    }
}
