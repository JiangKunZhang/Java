/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 15:26
 * 求最大值方法的重载
 */
public class Max {

    public static int max(int a,int b) {
        return a > b ? a : b;
    }

    public static double max(double a,double b) {
        return a > b ? a : b;
    }
    //两个小数和一个整数的顺序是啥，这样把传进来的整数变成双精度，然后三个小数比大小，机智机智
    public static double max(double a,double b,double c) {
        double temp = max(a,b);
        return temp > c ? temp : c;
    }

    public static void main(String[] args) {
        int a = 9,b = 6;
        double c = 3.0,d = 4.0;
        System.out.println(max(a,b));
        System.out.println(max(c,d));
        System.out.println(max(c,a,d));
    }
}
