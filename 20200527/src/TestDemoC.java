

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 19:59
 */
public class TestDemoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Queue<Integer>> lists = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Queue<Integer> queue = new LinkedList<>();
            int man = scanner.nextInt();
            queue.offer(man);
            for (int j = 0; j < man; j++) {
                int girl = scanner.nextInt();
                queue.offer(girl);
            }
            lists.add(queue);
        }
        int q = scanner.nextInt();
        while (q-- != 0) {
            Queue<Integer> queue1 = new LinkedList<>();
            Queue<Integer> queue2 = new LinkedList<>();
            int man1 = scanner.nextInt();
            int man2 = scanner.nextInt();
            queue1 = lists.get(man1-1);
            queue2 = lists.get(man2-1);
            queue1.poll();
            queue2.poll();
            boolean flg = true;
            while (!queue1.isEmpty() && !queue2.isEmpty()) {
                int pop = queue1.poll();
                if (queue2.contains(pop)) {
                    System.out.println("yes");
                    flg = false;
                    break;
                }
            }
            if (flg) {
                System.out.println("no");
            }
        }
    }
}
