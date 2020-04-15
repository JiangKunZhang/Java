/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/15 23:59
 * 二分查找
 * 给定一个有序整型数组, 实现二分查找
 */
public class BinarySearch {

    public static int binarySearch(int[] arr,int key) {
        int left = 0;
        int right = arr.length-1;
        //left>right就找不到了
        while (left <= right) {
            int mid = (left + right) / 2;
            if(key < arr[mid]) {
                right = mid - 1;
            }else if(key > arr[mid]) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        //没找到
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("index: " + binarySearch(array,9));
    }
}
