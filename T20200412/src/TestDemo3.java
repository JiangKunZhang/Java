/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-12
 * Time: 16:44
 */
public class TestDemo3 {

    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        int tmp = n * fac(n-1);
        return tmp;
    }

    public static void func1(int n) {
        //123
        if(n > 9) {
            func1(n/10);
        }
        System.out.println(n%10);
    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n+sum(n-1);
    }

    public static int func2(int n) {
        if(n < 10) {
            return n;
        }
        return n%10+func2(n/10);
    }

    public static int fabonaci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fabonaci(n-1)+fabonaci(n-2);
    }

    public static int fabonaci2(int n) {
        int f1 = 1;
        int f2 = 1;
        //注意：如果n是1 或者0的时候  那么 这里就有问题
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        //System.out.println(fac(4));
        //第50项的斐波那契数字  超过了int的取值范围  所以：是负数
        System.out.println(fabonaci2(40));
    }
}
