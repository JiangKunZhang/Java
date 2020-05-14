import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/13 16:22
 */
public class ATest {

    public static void main(String[] args) {
        A<Integer> a = new A<>(1);
        int ret = a.get();
        System.out.println(ret);
    }

    public static void main1(String[] args) {
        A<String> a = new A<>("hello world");
        String string = a.get();
        System.out.println(string);
    }
}
