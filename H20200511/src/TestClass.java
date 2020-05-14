import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/11 23:58
 */
public class TestClass {

    private static void testMethod(){

        System.out.println("testMethod");

    }

    public static void main(String[] args) {

        //把null强转为TestClass
        ((TestClass)null).testMethod();

    }

}