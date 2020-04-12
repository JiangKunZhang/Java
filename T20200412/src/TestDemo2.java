/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-12
 * Time: 15:59
 */
public class TestDemo2 {

    /**
     * 方法的重载(overload)：
     *    1、方法名相同
     *    2、返回值不作要求
     *    3、参数列表不同（参数的个数 或者 参数的类型 不同）
     *    4、同一个类当中
     * 面试题：
     *     同学  重载 和 重写 的区别是什么？
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(sum(a,b));
        double d1 = 19.9;
        double d2 = 18.8;
        System.out.println(sum(d1,d2));
    }
    public static int sum(int a,int b) {
        return a+b;
    }
    public static double sum(double a,double b) {
        return a+b;
    }
    public static double sum(double a,double b,double c) {
        return a+b+c;
    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
    }

    public static void swap(int x,int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }
}
