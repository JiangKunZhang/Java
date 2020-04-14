/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 21:54
 * 按顺序打印一个数字的每一位（例如1234打印1 2 3 4）
 */
public class PrintNumber {

    public static void print(int n) {
        if(n > 9) {
            print(n/10);
        }
        System.out.print(n%10+" ");
    }

    public static void main(String[] args) {
        int n = 1234;
        print(n);
    }
}
