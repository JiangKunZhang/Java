/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 15:33
 * 求和的重载
 */
public class Add {

    public static int add(int a,int b) {
        return a + b;
    }

    public static double add(double a,double b,double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int a = 1,b = 2;
        double c = 1.0,d = 2.0,e = 3.0;
        System.out.println(add(a,b));
        System.out.println(add(c,d,e));
    }
}
