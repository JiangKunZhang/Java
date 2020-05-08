import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/8 20:17
 */
public class TestDemo2 {
    public static String reverse(String str,int begin,int end) {
        char[] chars = str.toCharArray();
        while (begin < end) {
            char temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin++;
            end--;
        }
        return new String(chars);
    }

    public static String func(String str, int n) {
        if (str == null || n <= 0 || n >= str.length()) {
            return null;
        }
        str = reverse(str,0,n-1);
        str = reverse(str,n,str.length()-1);
        str = reverse(str,0,str.length()-1);
        return str;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String string = scanner.next();
        System.out.println(func(string,k));
    }
}
