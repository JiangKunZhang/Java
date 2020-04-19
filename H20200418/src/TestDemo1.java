/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/18 23:58
 */
public class TestDemo1{

    private int count;

    public static void main(String[] args) {

        TestDemo1 test=new TestDemo1(88);

        System.out.println(test.count);

    }

    TestDemo1(int a) {

        count=a;

    }

}