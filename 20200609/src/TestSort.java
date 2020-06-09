import java.util.Arrays;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/9 15:34
 */
public class TestSort {

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            int tmp = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void quick(int[] array, int left, int right) {
        if (left >= right) return;
        int par = partition(array, left, right);
        quick(array, left, par - 1);
        quick(array, par + 1, right);
    }

    public static int partition(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= tmp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }

    public static void quickSort1(int[] array) {
        int left = 0;
        int right = array.length-1;
        int par = partition(array,left,right);
        Stack<Integer> stack = new Stack<>();
        if (par > left + 1) {
            stack.push(left);
            stack.push(par - 1);
        }
        if (par < right - 1) {
            stack.push(par + 1);
            stack.push(right);
        }
        while (!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            par = partition(array,left,right);
            if (par > left + 1) {
                stack.push(left);
                stack.push(par - 1);
            }
            if (par < right - 1) {
                stack.push(par + 1);
                stack.push(right);
            }
        }
    }

    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }

    public static void mergeSortInternal(int[] array, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSortInternal(array, left, mid);
        mergeSortInternal(array, mid + 1, right);

        merge(array,left,mid,right);
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int s1 = left;
        int s2 = mid + 1;
        int len = right - left + 1;
        int[] ret = new int[len];
        int i = 0;
        while (s1 <= mid && s2 <= right) {
            if (array[s1] <= array[s2]) {
                ret[i++] = array[s1++];
            }else {
                ret[i++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            ret[i++] = array[s1++];
        }
        while (s2 <= right) {
            ret[i++] = array[s2++];
        }
        for (int j = 0; j < ret.length; j++) {
            array[left + j] = ret[j];
        }
    }

    public static void mergeSort1(int[] array) {
        for (int gap = 1; gap < array.length; gap *= 2) {
            mergeSortNor(array, gap);
        }
    }

    public static void mergeSortNor(int[] array, int gap) {
        int s1 = 0;
        int e1 = s1 + gap - 1;
        int s2 = e1 + 1;
        int e2 = s2 + gap - 1 < array.length ? s2 + gap - 1 : array.length - 1;
        int[] ret = new int[array.length];
        int i = 0;
        while (s2 < array.length) {
            while (s1 <= e1 && s2 <= e2) {
                if (array[s1] <= array[s2]) {
                    ret[i++] = array[s1++];
                }else {
                    ret[i++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                ret[i++] = array[s1++];
            }
            while (s2 <= e2) {
                ret[i++] = array[s2++];
            }
            s1 = e2 + 1;
            e1 = s1 + gap - 1;
            s2 = e1 + 1;
            e2 = s2 + gap - 1 < array.length ? s2 + gap - 1 : array.length - 1;
        }
        while (s1 <= array.length - 1) {
            ret[i++] = array[s1++];
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = ret[j];
        }
    }

    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        mergeSort1(array);
        System.out.println(Arrays.toString(array));
    }
}
