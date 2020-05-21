import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/21 19:16
 */
public class TestHeap {

    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
    }

    /**
     *
     * @param root 每棵子树的开始位置
     * @param len  结束位置
     */
    //O(log2n)
    public void adjustDown(int root,int len) {//向下调整
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            //0、判断是否有左右孩子  有的话 找到最大值 C下标表示最大值下标
            if(child + 1 < len) {
                child = this.elem[child] > this.elem[child + 1] ? child : child + 1;//大堆
            }
            //代码指向到这里，c表示最大值下标
            if(this.elem[child] > this.elem[parent]) {
                //交换
                int temp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = temp;
                //往下走
                parent = child;
                child = 2 * parent + 1;
            }else {
                break;//孩子节点小于根节点，那以孩子节点作为根节点的树就不用调整了，因为每个树的根节点就是最大的
            }
        }

    }

    //O(n)
    public void createHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //i：每棵子树的根节点下标
        for (int i = (this.usedSize-1-1)/2; i >= 0 ; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    public void push(int val) {
        //0、堆是否是满的--》扩容
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //1、放到数组的最后一个位置
        this.elem[this.usedSize++] = val;
        //2、进行调整
        adjustUp(this.usedSize - 1);//最后一个节点，记得-1
    }

    public void adjustUp(int child) {
        int parent = (child-1)/2;
        while (child > 0) {
            if (this.elem[child] > this.elem[parent]) {
                int temp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = temp;
                child = parent;
                parent = (child - 1) / 2;
            }else {
                break;
            }
        }
    }
    public boolean isFull() {
        return this.elem.length == this.usedSize;
    }

    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void pop() {
        //0.是否是空的
        if (isEmpty()) {
            throw new RuntimeException("为空");
        }
        //1.最后一个元素和堆顶元素交换
        int temp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize - 1];
        this.elem[this.usedSize - 1] = temp;
        this.usedSize--;
        //2.调整0号下标这棵树
        adjustDown(0,this.usedSize);
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    // O(n) + O(n*log2n)
    //时间复杂度：O(n*log2n)
    //空间复杂度：O(1)
    public void heapSort() {
        int end = this.usedSize-1;
        while (end > 0) {
            //1.交换 0 -> end
            int temp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = temp;
            //调整，向下调整
            adjustDown(0,end);//end这个节点不调整，调整的代码是 0 < len
            end--;
        }
    }

}
