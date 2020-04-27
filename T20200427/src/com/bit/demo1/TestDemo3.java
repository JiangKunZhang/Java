package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-27
 * Time: 19:11
 */
class Test{
    int a;//默认权限--》包访问权限-》只能在同一个包装进行访问
}

public class TestDemo3 {
    int b;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.a);
    }
}
