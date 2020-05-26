import java.util.Comparator;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/26 19:04
 */
class Generic<T extends Comparable<T>> {
    public T max (T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) max = array[i];
        }
        return max;
    }
}

class Generic2 {
    public static <T extends Comparable<T>> T max (T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) max = array[i];
        }
        return max;
    }
}

public class TestDemo {

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6};
        String[] array1 = {"aa","ss","dd"};
        System.out.println(Generic2.max(array));
        System.out.println();
        System.out.println(Generic2.<String>max(array1));
    }

    public static void main1(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>();
        Integer[] array = {1,2,3,4,5,6};
        System.out.println(integerGeneric.max(array));
    }
}
