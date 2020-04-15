/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 16:06
 * 数组所有元素之和
 */
public class SumArr {
    public static int  sum(int[] arr) {
        int sum = 0;
        for (int val:arr) {
            sum += val;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sum(arr));
    }
}
