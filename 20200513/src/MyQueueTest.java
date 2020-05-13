/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/13 20:42
 */
public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.size());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
    }
}
