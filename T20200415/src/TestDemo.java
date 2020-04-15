import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/15 22:15
 * TeacherCode
 */
public class TestDemo {

    public static void bubbleSort(int[] array) {
        boolean flg = false ;//没有发生交换
        for (int i = 0; i < array.length-1; i++) {
            flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                break;
            }
        }
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static void swap(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            while (left< right && array[left] % 2 == 0) {
                //偶数
                left++;
            }
            //left遇到奇数了
            while (left < right && array[right] % 2 != 0) {
                right--;
            }
            //right肯定遇到偶数了
            if(left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,3,1,6,7};
        swap(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 判断这个数组 是否是 升序的
     * 是：返回true
     * 不是 ：返回false
     * @param array
     * @return
     */
    public static boolean isUp(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main5(String[] args) {
        int[] array = {1,2,3,10,5,6};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.equals(array, ret));
    }


    /**
     * Arrays工具类当中的常用方法介绍：
     * toString()   binarySearch()   copyOf()
     *
     * @param args
     */
    public static void main4(String[] args) {

        int[] array = {1,21,13,4,52,46,7,18,9};
        Arrays.sort(array);//底层是什么排序？
        System.out.println(Arrays.toString(array));

        /*int[] array2 = new int[10];
        Arrays.fill(array2,2,5,8);
        System.out.println(Arrays.toString(array2));
*/

        /*int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.equals(array, array2));
*/
        /*int[] ret = Arrays.copyOfRange(array,2,5);
        System.out.println(Arrays.toString(ret));*/
        // [fromIndex,  toIndex)
        //System.out.println(Arrays.binarySearch(array,2,5,6));

    }

    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 顺序查找
     * @param array
     * @param key
     * @return
     */
    public static int count = 0;

    public static int find(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {

            if(array[i] == key) {
                return i;
            }
        }
        return -1;//代表没有这个元素  因为数组是没有-1下标的
    }
    /**
     *     二分查找。
     *     array: 序列       key：代表要查找的数字
     */
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            count++;
            int mid = (left+right)>>>1;
            if(array[mid] < key) {//8    17
                left = mid+1;
            }else if(array[mid] == key) {
                return mid;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }


    public static void main3(String[] args) {
        int[] array = new int[1_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
       /* int ret = binarySearch(array,9999);
        System.out.println("下标："+ ret+"找到次数："+count);*/

        System.out.println(Arrays.binarySearch(array, 9999));

    }

    /**
     * 数组的拷贝 有 4种方式：
     * for
     * Arrays.copyOf
     * System.arraycopy
     * clone() ：产生了这个对象的一个 副本   这个方法是Object的克隆方法
     * Object：是所有类的父类。祖先
     * 从本质上来说  都是浅拷贝。
     *
     * 浅拷贝：
     *
     * 深拷贝：
     *
     * @param args
     */
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        /*int[]ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));*/

        /*int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));*/

        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));

    }

    public static int[] copyArray(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }

    public static void main1(String[] argv) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
    }

}
