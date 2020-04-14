/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 14:31
 * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
 */
public class FindNumber {
    /**
     * 计数跳出
     * @param arr
     * @return
     */
    public static int findNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (1 == count) {
                return arr[i];
            }
        }
        return -1;
    }

    /**
     * 异或 a^b^b = a
     * @param arr
     * @return
     */
    public static int findNumber2(int[] arr) {
        int res = arr[0];
        for(int i = 1;i < arr.length;i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4};
        int res = findNumber(arr);
        int res2 = findNumber2(arr);
        System.out.println(res);
        System.out.println(res2);
    }
}
