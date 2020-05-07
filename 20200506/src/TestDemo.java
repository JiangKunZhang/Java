/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/6 18:47
 */
public class TestDemo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//false
        String str3 = "hello";
        System.out.println(str1 == str3);//true
        String str4 = "hel"+"lo";
        System.out.println(str1 == str4);//true
        String str5 = new String("hel") + "lo";
        System.out.println(str1 == str5);//false
    }
}
