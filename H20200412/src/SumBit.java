import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 22:04
 * 写一个递归方法，输入一个非负数，返回组成它的数字之和
 */
public class SumBit {

    public static int sumBit(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumBit(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(sumBit(num));
    }
}
