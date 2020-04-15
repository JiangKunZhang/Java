import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/15 18:43
 */
public class TestDemo {

    public static int[] copyArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int binarySearch(int[] arr,int key) {
        int left = 0;
        int right = arr.length;
        int mid;
        while(left <= right) {
            mid = (left + right) / 2;
            /**
             * mid = (left + right) >>> 1;
             * 无符号右移1位
             */
            if(key < arr[mid]) {
                right = mid - 1;
            }else if(key > arr[mid]) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7};
        //自己实现
        int[] array2 = copyArray(array1);
        System.out.println(Arrays.toString(array2));
        //Arrays.copyOf
        int[] array3 = Arrays.copyOf(array1,array1.length);//统一说都是浅拷贝，简单类型是深拷贝，引用类型是浅拷贝
        System.out.println(Arrays.toString(array3));
        //System.arraycopy
        int[] array4 = new int[array1.length];
        System.arraycopy(array1,0,array4,0,array1.length);//Native
        System.out.println(Arrays.toString(array4));
        //clone()
        int[] array5 = array1.clone();//Object
        System.out.println(Arrays.toString(array5));

        System.out.println(maxValue(array1));

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("index: " + binarySearch(arr,7));
        //调用系统的二分查找
        System.out.println(Arrays.binarySearch(arr,7));

        int a = 1_00000;
    }
}
