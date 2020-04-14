/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 15:22
 * 求最大值
 */
public class ThreeMax {
    public static int max3(int a,int b,int c) {
        return max2(max2(a,b),c);
    }

    public static int max2(int a,int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int a = 1,b = 2,c = 3;
        System.out.println(max3(a,b,c));
    }
}
