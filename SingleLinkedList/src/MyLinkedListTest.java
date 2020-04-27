
/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/24 14:12
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //测试头插
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.display();
        //测试尾插
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.display();
        //测试addIndex
        singleLinkedList.addIndex(0,0);
        singleLinkedList.display();
        //测试contains
        System.out.println(singleLinkedList.contains(10));
        //测试长度
        System.out.println(singleLinkedList.size());
        //测试romove
        singleLinkedList.romove(0);
        singleLinkedList.display();
        //测试romoveAllKey
        singleLinkedList.romoveAllKey(3);
        singleLinkedList.display();
        //测试clear
        System.out.println("开始clear");
        singleLinkedList.clear();
        System.out.println("clear结束");
        System.out.println("开始打印");
        singleLinkedList.display();
        System.out.println("打印结束");

    }
}
