package 下厨房;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/3 19:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while (sc.hasNext()) {
            String string = sc.nextLine();
            String[] tmp = string.split(" ");
            for (String s : tmp) {
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
}
