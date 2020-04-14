import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 22:35
 * 青蛙跳楼梯
 */
public class Frog {

    public static int step(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        } else {
            return step(n - 1) + step(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入台阶数:");
        int n = scanner.nextInt();
        System.out.println("跳法:");
        System.out.println(step(n));
    }
}
