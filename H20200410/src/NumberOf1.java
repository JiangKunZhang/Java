import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 23:23
 * 二进制中1的个数
 */
public class NumberOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0){
            num = num & (num -1);
            count++;
        }
        System.out.println(count);
    }
}
