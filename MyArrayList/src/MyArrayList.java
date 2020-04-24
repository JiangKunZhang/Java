import java.util.Arrays;

import javax.management.RuntimeErrorException;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/19 15:56
 */
public class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //判断是否为满
    private boolean isFull() {
        if(usedSize == this.elem.length) {
            return true;
        }
        return false;

        //return this.usedSize == this.elem.length;
    }

    //增加元素
    public void add(int pos,int data) {
        //扩容
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //判断下标
        if(pos < 0 || pos > this.usedSize) {
            //System.out.println("Index Error!");
            return;
        }
        //往后移
        int i = this.usedSize - 1;
        while (i >= pos) {
            this.elem[i+1] = this.elem[i];
            i--;
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //打印顺序表
    public void display() {
        for (int i = 0;i < this.usedSize;i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(this.elem));
    }

    //判断顺序表当中是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0;i < this.usedSize;i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0;i < this.usedSize;i++) {
            if (toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        if (this.usedSize == 0) {
            throw new RuntimeException("顺序表为空");
        }
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos非法");
        }
        return this.elem[pos];
    }

    //给pos位置的元素设置为value
    public void setPos(int pos,int value) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("index非法");
        }
        this.elem[pos] = value;

    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //删除第一次出现的关键字toRomove
    public void romove(int toRomove) {
        int index = search(toRomove);
        if (-1 == index) {
            System.out.println("没有需要删除的数字!");
            return;
        }
        for (int i = index;i < this.usedSize - 1;i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

        //清空顺序表
        public void clear() {
        this.usedSize = 0;
    }
}