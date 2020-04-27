package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-27
 * Time: 18:49
 */
class Base {
    public int a;
}
class Derive extends Base{
    public int b;
}
public class TestDemo2 {

    public static void main(String[] args) {

    }

    public static void main2(String[] args) {
        Test test = new Test();
        System.out.println(test.a);
    }

    public static void main1(String[] args) {
        Derive derive = new Derive();
        derive.a = 99;
    }
}
