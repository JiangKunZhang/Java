import java.util.Arrays;
import java.util.List;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/9 11:49
 */
public class MyStringTest {
    public static void main(String[] args) {

        MyString myString = new MyString("hello world hello world");
        MyString dst = new MyString("ello");

        //测试length()
        System.out.println(myString.length());

        //测试equals
        System.out.println(myString.equals(dst));

        //实现compareTo
        System.out.println(myString.compareTo(dst));

        //测试toCharArray()
        char[] ret = myString.toCharArray();
        System.out.println(Arrays.toString(ret));

        //测试contains
        System.out.println(myString.contains("hello"));

        //测试indexOf()
        System.out.println(myString.indexOf(dst));

        //测试replaceAll
        System.out.println(myString.replaceAll(' ','#'));

        //测试replaceFirst
        System.out.println(myString.replaceFirst(' ','#'));
        System.out.println("-----------------------------------------");

        //测试split
       String str1 = "hh hh hh hh ";
       String str2 =" ";
       String[] result = myString.split(str1,str2);
        for (String s:result) {
            System.out.println(s);
        }
    }
}
