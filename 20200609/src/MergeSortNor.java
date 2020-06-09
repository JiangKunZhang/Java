import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/9 18:09
 */
public class MergeSortNor {
    public static void mergeSort(int[] array) {
        for (int gap = 1; gap < array.length; gap *= 2) {
            mergeSortNor(array,gap);
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
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
