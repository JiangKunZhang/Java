import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 17:15
 */
public class TestDemo3 {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }else {
            return n + sum(n - 1);
        }
    }

    public static int add(int n) {
        if (n <= 9) {
            return n;
        }
        return n % 10 + add(n / 10);
    }

    public static int fabonaqi(int n) {
        if(n == 1||n == 2){
            return 1;
        }
        return fabonaqi(n-1) + fabonaqi(n - 2);
    }

    public static int fab2(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i = 3;i <= n;i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(5));
        System.out.println(add(1729));
        System.out.println(fabonaqi(5));
        System.out.println(fab2(5));

    }
}
