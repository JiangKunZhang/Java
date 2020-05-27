import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 19:37
 */
public class TestDenoI {
    public static int is_prime(int n) {
        //判断n是否为素数
        //2->n-1
        int i = 0;
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0)
                return 0;
        }
        //是素数
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (is_prime(i) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
