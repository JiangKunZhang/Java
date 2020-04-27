package com.bit.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *    多态
 * User: GAOBO
 * Date: 2020-04-27
 * Time: 20:08
 */

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
        //System.out.println("Animal(String)");
        eat();
    }
    public void eat() {
        System.out.println(this.name+"   Animal::eat()");
    }
}
class Cat extends Animal{
    public int count = 99;
    public Cat(String name) {
        super(name);//显示调用父类的构造方法
        //super.name = "hhhh";
        //System.out.println("Cat(String)");
    }
    public void eat() {
        System.out.println(this.name+"的示范法Cat::eat()");
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
public class TestMain {

    public static void main(String[] args) {
        Cat cat = new Cat("八个");
        //cat.eat();
    }

    /**
     * 演示不安全的向下转型
     * @param args
     */
    public static void main7(String[] args) {
        Animal animal = new Cat("八个");
        //A instanceof B   判断A 是不是 B的一个实例
        if( animal instanceof  Bird ) {
            //向下转型
            Bird bird = (Bird)animal;
            bird.fly();
        }else {
            System.out.println("fafsdafsfa");
        }
    }

    /**
     * 演示向下转型
     * 注意：向下转型非常不安全 很少会使用向下转型
     * @param args
     */
    public static void main6(String[] args) {
        Animal animal = new Bird("八个");
        animal.eat();

        //向下转型->   父类的引用  赋值给了 子类
        Bird bird = (Bird)animal;
        bird.fly();
    }

    /**
     * 多态
     *
     * 运行时绑定：
     * 父类引用 引用子类对象。同时 通过父类引用调用同名的覆盖方法
     * 此时就会发生运行时绑定。
     *
     * 反编译Java代码：
     * @param args
     */
    public static void main5(String[] args) {
        Animal animal = new Cat("咪咪");
        animal.eat();//
    }



    public static Animal func() {
        return new Cat("咪咪");
    }
    public static void main4(String[] args) {
        Animal animal = func();
        animal.eat();
    }
    public static void func(Animal animal) {
        animal.eat();
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("咪咪");
        func(cat);
    }

    //向上转型
    public static void main2(String[] args) {
        //向上转型-》父类引用 引用子类对象
        Animal animal = new Cat("咪咪");
        animal.eat();

        //animal.count;

        // error 向上转型之后，通过父类的引用 只能访问父类自己的方法或者属性
        //父类引用 只能访问自己特有的。
    }

    public static void main1(String[] args) {
        Animal animal = new Animal("豆豆");

        Cat cat = new Cat("咪咪");
    }
}
