import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/15 20:24
 */
public class TestDemo2 {

    /**
     * 判断是否升序
     * @param arr
     * @return
     */
    public static boolean isUp(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //i < arr.length;    arr[i+1]就越界了
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //基础版本快排
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    //优化版本快排
    public static void bubbleSort2(int[] array) {
        boolean flag;
        for (int i = 0; i < array.length-1; i++) {
            flag = true;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }
            //某一趟之后，没有交换两个数，那就说明已经有序
            if(flag == true) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6};
        System.out.println(isUp(arr));

        //验证拷贝出来的数组和原数组一样不
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.equals(arr,arr2));

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
