import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 14:42
 * 求阶乘和
 */
public class SumFactorial {
    public static int func(int n) {
        if (n == 1) {
            return 1;
        }
        return n * func(n - 1);
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += func(i);
        }
        System.out.println(sum);
    }
}
