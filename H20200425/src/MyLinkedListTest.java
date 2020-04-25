/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/25 13:48
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //测试头插
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        //测试打印
        myLinkedList.display();
        //测试尾插
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.display();
        //测试长度
        System.out.println(myLinkedList.size());
        //测试删除一个
        myLinkedList.romove(4);
        myLinkedList.display();
        //测试包含
        System.out.println(myLinkedList.contains(4));
        //测试index位置插入
        myLinkedList.addIndex(0,0);
        myLinkedList.display();
        //测试删除所有key
        myLinkedList.romoveAllKey(3);
        myLinkedList.display();
        //测试清空
        System.out.println("开始清空");
        myLinkedList.clear();
        System.out.println("清空结束");
        System.out.println("开始打印");
        myLinkedList.display();
        System.out.println("打印结束");
    }
}
