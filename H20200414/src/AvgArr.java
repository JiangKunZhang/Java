/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 16:03
 * 求数组的平均值
 */
public class AvgArr {

    public static double avg(int[] arr) {
        double sum = 0;
        for (int val:arr) {
            sum += val;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(avg(arr));
    }
}
