import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 23:34
 * 整数的每一位
 */
public class BitOfInteger {
    public static void print(int n) {
        if(n > 9){
            print(n / 10);
        }
        System.out.println(n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
    }
}
