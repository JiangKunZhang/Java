import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 19:14
 */
public class TestDemoK {

    public static int is_prime(long n) {
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
        int t = scanner.nextInt();
        boolean flg = true;
        long x;
        long y;
        while (t-- != 0) {
            flg = true;
            x = scanner.nextLong();
            y = scanner.nextLong();
            if (y-x <= 1) {
                System.out.println("No");
                flg = false;
            }else if (is_prime(y-x) == 1) {
                System.out.println("Yes");
                flg = false;
            }else {
                for (int k = 2; k <= y - x; k++) {
                    if (is_prime(k) == 1) {
                        if ((y - x) % k == 0) {
                            System.out.println("Yes");
                            flg = false;
                            break;
                        }
                    }
                }
            }
            if (flg == true) {
                System.out.println("No");
            }
        }
    }
}
