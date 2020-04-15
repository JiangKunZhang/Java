/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/15 23:55
 * 数组是否有序
 * 给定一个整型数组, 判定数组是否有序（递增）
 */
public class IsUp {

   public static boolean isUp(int[] arr) {
       for (int i = 0; i < arr.length-1; i++) {
           if(arr[i] > arr[i+1]) {
               return false;
           }
       }
       return true;
   }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,4,3,2,1};
        System.out.println(isUp(array));
    }
}
