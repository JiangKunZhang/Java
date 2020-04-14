/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 21:50
 * 递归求n的阶乘
 */
public class Factorial {

    public static int func(int n) {
        if (n == 1) {
            return 1;
        }
        return n * func(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(func(n));
    }
}
