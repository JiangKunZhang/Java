/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 21:52
 * 递归求1+2+3+...+10
 */
public class Sum {

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}
