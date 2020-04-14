import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 14:53
 * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
 */
public class OddEvenChange {

    public static void oddEvenChange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            //当左下标遇到奇数，继续向右遍历，直到遇见偶数为止
            while ((left < right) && arr[left] % 2 == 1) {
                left++;
            }
            //当右下标遇到偶数，继续向左遍历，直到遇见奇数为止
            while ((left < right) && arr[right] % 2 == 0) {
                right--;
            }
            //当左<右，左边奇数和右边偶数进行交换
            if(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));
        oddEvenChange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
