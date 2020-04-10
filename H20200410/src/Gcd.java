import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 22:01
 * 最大公约数
 */
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        if(a > b) {
            c = b;
        }else {
            c = a;
        }
        for(int i = c;c > 0;c--){
            if((a % i == 0)&&(b % i == 0)) {
                System.out.println(i);
                break;
            }
        }
    }
}
