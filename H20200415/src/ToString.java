/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/16 0:07
 * 数组转字符串
 * 实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
 */
public class ToString {

    public static String toString(int[] arr) {
        String res ="[";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if(i < arr.length-1) {
                res += ", ";
            }
        }
        res += "]";
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String res = toString(arr);
        System.out.println(res);
    }
}
