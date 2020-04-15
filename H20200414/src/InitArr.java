import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 16:13
 * 创建的数组，并且赋初始值
 */
public class InitArr {

    public static void initArr(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            arr[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        System.out.println(Arrays.toString(arr));
        initArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
