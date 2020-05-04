package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-30
 * Time: 20:32
 */
interface A {
    void func1();
}
interface B {
    void func2();
}
//extends扩展
interface C extends A,B {
    void func3();
}
class TestB implements C{
    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }
    
    @Override
    public void func3(){

    }
}

class Test implements A,B {

    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }
}
public class TestDemo {
    public static void main(String[] args) {

    }
}
