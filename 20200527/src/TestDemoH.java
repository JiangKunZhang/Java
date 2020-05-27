import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 21:27
 */
public class TestDemoH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int len = s.length();
        int c = 0;
        for (int i = len; i > 0; i--) {
            c = len - i - i;
            if (c >= i) {
                break;
            }
        }
        int width = len - c - c;
        for (int i = 0; i < len; i++) {
            System.out.print(s.charAt(i));
        }
    }
}
