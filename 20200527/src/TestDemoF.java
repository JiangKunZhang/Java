import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 21:02
 */
public class TestDemoF {
    public static void main(String[] args) {
        String a;
        String b;
        String tmp;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            tmp = scanner.nextLine();
            String[] strings = tmp.split(" ");
            a = strings[0];
            b = strings[1];
            for (int i = 0; i < a.length(); i++) {
                tmp = a.substring(i,a.length());
                if (b.contains(tmp)) {
                    a = a.substring(0,i);
                }
            }
            a = a + b;
            System.out.println(a);
        }

    }
}
