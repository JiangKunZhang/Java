import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/14 14:25
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    public boolean idFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    public void add(int index, int val) {
        if (idFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if (index < 0 || index > this.usedSize) {
            throw new RuntimeException("index非法");
        }
        int i = this.usedSize - 1;
        while (i >= index) {
            this.elem[i + 1] = this.elem[i];
            i--;
        }
        this.elem[index] = val;
        this.usedSize++;
    }

    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public boolean contains(int val) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == val) {
                return true;
            }
        }
        return false;
    }

    public int search(int val) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public int getPos(int pos) {
        if (this.usedSize == 0) {
            throw new RuntimeException("顺序表为空");
        }
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos非法");
        }
        return this.elem[pos];
    }

    public void setPos(int pos, int val) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos非法");
        }
        this.elem[pos] = val;
    }

    public void toRemove(int val) {
        int index = search(val);
        if (index == -1) {
            throw new RuntimeException("val不存在!");
        }
        while (index < this.usedSize - 1) {
            this.elem[index] = this.elem[index + 1];
            index++;
        }
        this.usedSize--;
    }

    public void clear() {
        this.usedSize = 0;
    }
}
