/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 16:11
 * 打印数组
 */
public class PrintArr {

    public static void printArr(int[] arr) {
        for (int val:arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArr(arr);
    }
}
