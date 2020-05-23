import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/23 16:58
 */
public class MyHeap {
    public int[] elem;
    public int usedSize;
    public MyHeap() {
        this.elem = new int[10];
    }

    public void createHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        for (int i = (this.usedSize-1-1) / 2; i >= 0; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    public void adjustDown(int root, int length) {
        int parent = root;
        int child = root * 2 + 1;
        while (child < length) {
            if (child + 1 <length && this.elem[child] < this.elem[child + 1]) {
                child++;
            }
            if (this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = tmp;
                parent = child;
                child = parent * 2 + 1;
            }else {
                break;
            }
        }
    }

    public void adjustUp(int child) {
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = tmp;
                child = parent;
                parent = (child - 1) / 2;
            }else {
                break;
            }
        }
    }

    public void push(int val) {
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        this.elem[usedSize] = val;
        this.usedSize++;
        adjustUp(this.usedSize - 1);
    }

    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("为空");
        }
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize - 1];
        this.elem[this.usedSize - 1] = tmp;
        this.usedSize--;
        adjustDown(0,this.usedSize);
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void heapSort() {
        int end = this.usedSize - 1;
        while (end > 0) {
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            adjustDown(0,end);
            end--;
        }
    }
}
