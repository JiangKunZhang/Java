/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-26
 * Time: 12:41
 */
public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.display();
        myLinkedList.clear();
        System.out.println("fajdfjaljdsjaljfl");

       /* myLinkedList.addIndex(0,99);
        myLinkedList.display();
        myLinkedList.addIndex(5,199);
        myLinkedList.display();
        myLinkedList.addIndex(2,9999);
        myLinkedList.display();
        myLinkedList.removeAllKey(2);
        myLinkedList.display();*/

        /*
        System.out.println(myLinkedList.contains(4));
        System.out.println(myLinkedList.size());*/
    }
}
