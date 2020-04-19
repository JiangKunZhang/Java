import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/19 11:40
 * 奇数放到数组后面
 * 给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
 */
public class ArrayChange {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public ArrayChange(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayChange{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
