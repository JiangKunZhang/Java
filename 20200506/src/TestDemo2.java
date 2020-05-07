import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/6 20:32
 */
public class TestDemo2 {

    public static boolean func(String str) {
        char[] val = str.toCharArray();
        int length = val.length;
        for (int i = 0; i < length; i++) {
            if (val[i] > '9' || val[i] < '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "12345";
        Boolean flg = func(str);
        System.out.println(flg);
    }

    public static void main1(String[] args) {
        String str = "abcde";
        char[] val = {'a','b','c'};

        String str2 = new String(val);
        System.out.println(str2);

        String str3 = new String(val,1,2);
        System.out.println(str3);

        char ch = str.charAt(0);
        System.out.println(ch);

        char[] val2 = str.toCharArray();
        System.out.println(Arrays.toString(val2));
    }
}
