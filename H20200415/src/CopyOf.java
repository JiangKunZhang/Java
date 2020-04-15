import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/16 0:04
 * 数组的拷贝
 * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
 */
public class CopyOf {

    public static int[] copyOf(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] res = copyOf(array);
        System.out.println(Arrays.toString(res));
    }
}
