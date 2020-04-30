/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/30 19:39
 *
 * 浅拷贝
 *
 */

class Money1 {
    double money = 12.5;

}

class Person1 implements Cloneable{
    public int age;
    Money1 m = new Money1();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}

public class TestDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person1 person1 = new Person1();
        Person1 person2 = (Person1)person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("========修改==========");
        person2.m.money = 99.9;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}
