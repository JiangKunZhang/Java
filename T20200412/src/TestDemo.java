import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * idea自动创建类注释
 * 背景可以变为图片
 * IDEA的调试
 *  1、打断点：让代码走到这一步  停下来
 *  2、开始调试：点击甲壳虫
 * User: GAOBO
 * Date: 2020-04-12
 * Time: 14:35
 */

/**
 * Java 的方法  对应的就是 C语言当中的  函数
 *
 * 方法：功能。
 *  public static  返回值   方法名(形式参数列表) {
 *      方法体;
 *  }
 *
 *  方法名: 要采用小驼峰的形式。maxNum
 *
 *  public static :因为当前所有的方法 写完之后  会在main方法中调用
 *  因为main方法是public static 的。
 *
 *  返回值：可有可无 具体看业务需求。
 *     如果有返回值  那么  返回值的类型需要和方法的返回值类型匹配
 *
 * 形式参数列表：形参-》实参的一份拷贝。
 *
 * 方法体：就是具体方法的实现
 *
 * return 代表函数的结束  他下面的代码 将不会被执行。
 */
public class TestDemo {

    public static int sum(int a,int b) {
        return a+b;
    }

    public static int factor(int n) {
        //每一个数字 1-n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }
    /**
     * 求某个数字的阶乘！
     * @param num
     * @return
     */
    public static int fac(int num) {
        int ret = 1;
        for (int i = 1; i <= num ; i++) {
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(factor(7));
    }

    public static void main5(String[] args) {
        int a = 10;
        int b = 20;
        int ret = sum(a,b);
        System.out.println(ret);
        int ret2 = sum(80,40);
        System.out.println(ret2);
    }

    public static int maxNum(int num1,int num2) {
        return num1 > num2 ? num1 : num2;
    }

    //求3个数的最大值
    public static int maxThreeNum(int num1,int num2,int num3) {
        //return maxNum(maxNum(num1,num2),num3);
        int max = maxNum(num1,num2);
        return maxNum(max,num3);
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();*/
        int n1 = 10;
        int n2 = 20;
        int n3 = 8;
        /*int ret = maxThreeNum(n1,n2,n3);
        System.out.println(ret);*/
        /*System.out.println(maxThreeNum(n1,n2,n3));*/
        System.out.println(maxThreeNum(n1, n2, n3));//maxThreeNum(n1, n2, n3) .sout
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 31; i >= 1 ; i -= 2) {
            System.out.print(((n >> i) & 1)+" ");//
        }
        System.out.println();
        for (int i = 30; i >= 0 ; i -= 2) {
            System.out.print(((n >> i) & 1)+" ");//
        }
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n>>i) & 1) == 1) {
                count++;
            }
        }
        System.out.println("count: "+ count);
    }
}
