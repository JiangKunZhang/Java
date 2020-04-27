package com.bit.demo1;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/27 19:35
 */

class Animal {
    protected String name;
    public void eat() {
        System.out.println(this.name + "eat()");
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
        //super.name = "fs";
    }
    public void sleep() {
        System.out.println(super.name + "   sleep()");
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Cat cat = new Cat("sfa");
        cat.sleep();
    }

}
