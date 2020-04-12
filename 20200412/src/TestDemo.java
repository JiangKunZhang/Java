/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 15:26
 */
public class TestDemo {

    public static int maxNum(int a,int b,int c) {
        return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(maxNum(a,b,c));
    }
}
