/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 16:21
 */
public class TestDemo2 {

    public static int sum(int a,int b) {
        return a + b;
    }

    public static int sum(int a,int b,int c) {
        return a + b + c;
    }

    public static int sum(int a,int b,int c,int d) {
        return a + b + c + d;
    }

    public static double sum(double a,double b) {
        return a + b;
    }

    public static double sum(double a,double b,double c) {
        return a + b + c;
    }

    public static double sum(double a,double b,double c,double d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int a = 1,b = 2,c = 3,d = 4;
        double d1 = 1.0,d2 = 2.0,d3 = 3.0,d4 = 4.0;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b,c,d));
        System.out.println(sum(d1,d2));
        System.out.println(sum(d1,d2,d3));
        System.out.println(sum(d1,d2,d3,d4));
    }
}
