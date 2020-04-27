package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-27
 * Time: 18:36
 */
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }
    public void eat() {
        System.out.println(this.name+"   Animal::eat()");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);//显示调用父类的构造方法
        //super.name = "hhhh";
        System.out.println("Cat(String)");
    }
}

class ChineseGardenCat extends Cat {
    public ChineseGardenCat(String name) {
        super(name);
    }
}

class Organge extends ChineseGardenCat {
    public Organge(String name) {
        super(name);
    }
}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(this.name + "Bird::fly()");
    }
}
public class TestDemo {

    public static void main(String[] args) {

    }

    public static void main2(String[] args) {
        ChineseGardenCat chineseGardenCat = new ChineseGardenCat("haha");
        chineseGardenCat.eat();
    }

    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        cat.eat();//可以访问自己的
        Bird bird = new Bird("八哥");
        bird.fly();//可以访问自己的
        bird.eat();//可以访问父类的
    }
}
