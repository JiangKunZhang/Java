import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 22:08
 * 求斐波那契数列的第N项
 */
public class Fib {

    /**
     * 递归实现
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n == 1||n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * 迭代实现
     * @param n
     * @return
     */
    public static int fib2(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i = 3;i <= n;i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("递归实现："+fib(n));
        System.out.println("循环实现："+fib2(n));
    }
}
