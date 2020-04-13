/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/13 21:11
 */
public class TestDemo {

    public static String myToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(myToString(array));
    }
}
