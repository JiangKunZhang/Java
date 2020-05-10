package com.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-10
 * Time: 17:16
 */

/**
 * <T> : 只是一个占位符，表示当前类是一个泛型类
 * 泛型的意义：
 * 1、可以自动进行类型的检查
 * 2、可以自动进行类型的转换
 *
 * 面试问题： 泛型到底是怎么编译的？
 * 面试官想知道的就是4个字：擦除机制。
 * 重要：泛型只是编译时期的一种机制。--》擦除机制。在运行的时候，不存在泛型这种说法。
 * 所有的处理均在编译阶段已经处理。
 *
 * 擦除机制：在编译的时候，泛型类型被擦除为Object了。不是替换
 *
 * @param <T>
 *
 * 泛型的坑：
 * 1、不能new泛型类型的数组。T a =  new T[10];
 * 2、简单类型不能作为泛型类型的参数
 *     MyArrayList<float> myArrayList3 = new MyArrayList<>();
 *3、 泛型类型参数，不参与类型的组成。
 *      MyArrayList<Integer> myArrayList = new MyArrayList<>();
 *      com.demo1.MyArrayList@154617c
 *
 */
public class MyArrayList<T> {
    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        //this.elem =  new T[10];
        this.elem =  (T[])new Object[10];
        this.usedSize = 0;
    }
    //默认放到数组最后
    public void add(T val) {
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    public T getVal(int pos) {
        return this.elem[pos];
    }

}
