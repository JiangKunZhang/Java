package 旧键盘;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/28 19:27
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();//7_This_is_a_test
        String actual = scanner.nextLine();//_hs_s_a_es

        //1、把实际的字符转换为大写存放到集合当中
        HashSet<Character> setActual = new HashSet<>();
        for (char s : actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }
        HashSet<Character> setBroken = new HashSet<>();
        for (char s : expected.toUpperCase().toCharArray()) {
            if (!setActual.contains(s) && !setBroken.contains(s)) {
                System.out.print(s);
                setBroken.add(s);
            }
        }
    }
}
