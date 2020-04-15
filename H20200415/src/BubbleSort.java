import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/15 23:57
 * 冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean flag;
        for (int i = 0; i < arr.length-1; i++) {
            flag = true;
            for (int j = 0;j < arr.length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
