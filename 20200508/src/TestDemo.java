/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/8 19:54
 */
public class TestDemo {
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

    public static void main(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }

}
