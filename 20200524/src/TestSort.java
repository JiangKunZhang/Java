import java.util.Arrays;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/24 14:50
 */
public class TestSort {
    public static int partition(int[] array,int low,int high) {
        int tmp = array[low];
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= tmp) {
                low++;
            }
            int temp = array[low];
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }

    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        //三数取中法
        three_num_mid(array,left,right);

        int par = partition(array,left,right);
        quick(array,left,par - 1);
        quick(array,par + 1,right);
    }

    public static void three_num_mid(int[] array,int left,int right) {
        //array[mid] <= array[left] <= array[right]
        int mid = (left + right) / 2;
        if (array[mid] > array[left]) {
            swap(array,mid,left);
        }
        if (array[mid] > array[right]) {
            swap(array,mid,right);
        }
        if (array[left] > array[right]) {
            swap(array,left,right);
        }
    }

    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    /**
     * 时间复杂度：O(nlogn) 最坏情况下：O(n^2)  1 2 3 4 5 6 7 8 9 / 9 8 7 6 5 4 3 2 1
     * 空间复杂度：O(logn)  最坏情况下：O(n)
     * 稳定性：不稳定
     * 快排要快，那么每次划分序列的时候，如果都可以均匀的进行划分。那么效率最好
     * @param array
     */
    public static void quickSort1(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = array.length-1;

        int par = partition(array,left,right);

        if(par > left+1) {
            stack.push(left);
            stack.push(par-1);
        }
        if(par < right-1) {
            stack.push(par+1);
            stack.push(right);
        }
        while (!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            par = partition(array,left,right);

            if(par > left+1) {
                stack.push(left);
                stack.push(par-1);
            }
            if(par < right-1) {
                stack.push(par+1);
                stack.push(right);
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
