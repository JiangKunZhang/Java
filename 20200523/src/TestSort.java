import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/23 21:56
 */
public class TestSort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

    public static void shell(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j;
            for (j = i - gap; j >= 0; j -= gap) {
                if (array[j] > tmp) {
                    array[j + gap] = array[j];
                }else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5, 3, 1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }

    public static void heapSort(int[] array) {
        createHeap(array);
        int end = array.length - 1;
        while (end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(0,end,array);
            end--;
        }
    }

    public static void createHeap(int[] array) {
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {
            adjustDown(i, array.length, array);
        }
    }

    public static void adjustDown(int root ,int length, int[] array) {
        int parent = root;
        int child = parent * 2 + 1;
        while (child < length) {
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = parent * 2 + 1;
            }else {
                break;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
