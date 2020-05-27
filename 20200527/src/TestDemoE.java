import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 20:18
 */
public class TestDemoE {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('C',12);
        map.put('H',1);
        map.put('O',16);
        map.put('N',14);

        Scanner scanner = new Scanner(System.in);
        String string = null;
        char[] chars;
        Queue<Character> queue = new LinkedList<>();
        int n = scanner.nextInt();
        int res = 0;
        int num = 0;
        for (int k = 0; k < n; k++){
            res = 0;
            string = scanner.next();
            chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                queue.offer(chars[i]);
            }
            while (!queue.isEmpty()) {
                char top = queue.poll();
                if (!queue.isEmpty() && queue.peek() >= '0' && queue.peek() <= '9') {
                    num = 0;
                    while (!queue.isEmpty() && queue.peek() >= '0' && queue.peek() <= '9') {
                        char tmp = queue.poll();
                        num *= 10;
                        num += tmp - '0';
                    }
                    res += map.get(top) * num;
                }else {
                    res += map.get(top);
                }
            }
            if (k != n-1) {
                System.out.print(res + " ");
            }else {
                System.out.print(res);
            }
        }
    }
}
