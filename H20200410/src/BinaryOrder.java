import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 23:28
 *输出一个数二进制序列的奇数和偶数序列
 */
public class BinaryOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        //打印奇数位
        System.out.println("打印奇数位");
        for (i = 30; i >= 0; i -= 2) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
        //打印偶数位
        System.out.println("打印偶数位");
        for (i = 31; i >= 1; i -= 2) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
}
