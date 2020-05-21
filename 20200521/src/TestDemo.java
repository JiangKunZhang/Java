/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/21 19:31
 */
public class TestDemo {
    public static void main(String[] args) {
        //65 49 34 25 37 27 19 18 15 28
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        TestHeap testHeap = new TestHeap();
        testHeap.createHeap(array);
        testHeap.show();
        testHeap.push(80);
        testHeap.show();
        testHeap.pop();
        testHeap.show();
        System.out.println(testHeap.peek());
        testHeap.heapSort();
        testHeap.show();
    }
}
