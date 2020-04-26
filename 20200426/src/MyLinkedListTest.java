/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/26 19:03
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addIndex(3,4);
        myLinkedList.display();
        myLinkedList.removeAllKey(2);
        myLinkedList.display();
        myLinkedList.clear();
        myLinkedList.display();
    }
}
