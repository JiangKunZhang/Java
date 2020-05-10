/**
 * Created with IntelliJ IDEA.
 * Description: 自定义异常
 * User: GAOBO
 * Date: 2020-05-10
 * Time: 10:11
 */

/**
 * 1、一定要继承一个父类异常
 */
class MyException extends RuntimeException{
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}

public class TestDemo2 {
    public static void func(int x) throws MyException{
        if(x == 10) {
            throw new MyException("x==10");
        }
    }

    public static void main(String[] args) {
        try {
            func(10);
        }catch (MyException e) {
            e.printStackTrace();
        }
    }
}
