import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 19:43
 * 判断素数
 */
public class IsPrime {

    public static boolean isPrime(int n){
        if (n <= 3) {
            return n > 1;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)) {
            System.out.println("是素数");
        }else {
            System.out.println("不是素数");
        }
    }
}
