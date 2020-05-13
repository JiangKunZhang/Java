import java.util.Arrays;
import java.util.Objects;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/13 18:53
 *
 * 实现Stack
 *
 */
public class MyStack<T> {
    public T[] elem;//数组
    public int top;//表示当前可以存放数据元素的下标

    public MyStack() {
        this.elem = (T[])new Object[10];
    }

    public void push(T data) {
        if (full()) {
            this.elem = Arrays.copyOf(this.elem,2 * this.elem.length);
        }
        this.elem[this.top++] = data;
    }

    public boolean full() {
        return this.top == this.elem.length;
    }

    public boolean empty() {
        return this.top == 0;
    }

    public T pop() {
        if (empty()) {
            throw new RuntimeException("栈空！");
        }
        T data = this.elem[this.top - 1];
        this.top--;//top往下移，下次直接在top插入，覆盖掉
        return data;
        //return this.elem[--this.top];
    }

    public T peek() {
        if (empty()) {
            throw new RuntimeException("栈空！");
        }
        return this.elem[top - 1];
    }

    public int size() {
        return this.top;
    }
}
