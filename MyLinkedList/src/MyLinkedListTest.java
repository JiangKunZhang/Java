
/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/24 14:12
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //测试头插
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.display();
        //测试尾插
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.display();
        //测试addIndex
        myLinkedList.addIndex(0,0);
        myLinkedList.display();
        //测试contains
        System.out.println(myLinkedList.contains(10));
        //测试长度
        System.out.println(myLinkedList.size());
        //测试romove
        myLinkedList.romove(0);
        myLinkedList.display();
        //测试romoveAllKey
        myLinkedList.romoveAllKey(3);
        myLinkedList.display();
        //测试clear
        System.out.println("开始clear");
        myLinkedList.clear();
        System.out.println("clear结束");
        System.out.println("开始打印");
        myLinkedList.display();
        System.out.println("打印结束");

    }
}
