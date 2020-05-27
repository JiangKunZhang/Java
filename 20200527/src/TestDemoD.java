import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 19:41
 */
public class TestDemoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger res = BigInteger.ONE;
        long n = scanner.nextLong();
        for (long i = 1; i <= n; i++) {
            res = res.multiply(new BigInteger(i+""));
        }
        res = res.mod(new BigInteger(10+""));
        System.out.println(res);
    }
}
