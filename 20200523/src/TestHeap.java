/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/23 17:44
 */
public class TestHeap {
    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        myHeap.createHeap(array);
        myHeap.show();
        myHeap.pop();
        myHeap.show();
        myHeap.push(65);
        myHeap.show();
        System.out.println("开始排序");
        myHeap.heapSort();
        myHeap.show();
    }
}
