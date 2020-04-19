import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/19 12:09
 *  奇数放到数组后面
 *  给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
 */
public class OddEvenChange {
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public OddEvenChange(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "ArrayChange{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public void change() {
        int left = 0;
        int right = this.arr.length - 1;
        while (left < right) {
            while (left < right && this.arr[left] % 2 != 1 ) {
                left++;
            }
            while (left < right && this.arr[right] % 2 == 1 ) {
                right--;
            }
            if(left < right) {
                int temp = this.arr[left];
                this.arr[left] = this.arr[right];
                this.arr[right] = temp;
            }
        }
    }
}
