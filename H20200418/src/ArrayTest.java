import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/19 12:32
 */
public class ArrayTest {
    //为什么交换不了
    public static void swap(int[] a,int[] b) {
        int[] temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
//        int[] temp = arr1;
//        arr1 = arr2;
//        arr2 = temp;
        swap(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
