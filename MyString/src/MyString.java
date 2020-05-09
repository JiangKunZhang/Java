import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/9 10:09
 */
public class MyString {
    char[] value;
    public MyString() {
        value = new char[0];
    }
    public MyString(char[] chars) {
        this.value = chars;
    }
    public MyString(String s) {
        value = s.toCharArray();
    }

    //实现length
    public int length() {
        return value.length;
    }

    //实现equals
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        //判断是不是MyString类型
        if (object instanceof MyString) {
            MyString anString = (MyString)object;
            if (anString.length() == this.length()) {
                char[] v1 = anString.value;
                char[] v2 = value;
                int n = v1.length;
                while (n-- != 0) {
                    if (v1[n] != v2[n]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    //实现compareTo
    public int compareTo(MyString myString) {
        char[] v1 = value;
        char[] v2 = myString.value;
        int len1 = v1.length;
        int len2 = v2.length;
        int lim = Math.min(len1,len2);
        int n = 0;
        while (n < lim) {
            if (v1[n] != v2[n]) {
                return v1[n] - v2[n];
            }
            n++;
        }
        return len1 - len2;
    }

    //实现toCharArray
    public char[] toCharArray() {
        char[] ret = new char[value.length];
        System.arraycopy(value,0,ret,0,value.length);
        return ret;
    }

    //实现contains
    public boolean contains(CharSequence s) {
        return indexOf(new MyString(s.toString())) > -1;
    }

    //实现indexOf
    public int indexOf(MyString myString) {
        if (myString.length() < 1 || this.length() < 1) {
            return -1;
        }
        if (myString.length() > this.length()) {
            return -1;
        }
        char[] src = value;
        char[] dst = myString.value;
        int srcLen = src.length;
        int dstLen = dst.length;
        for (int i = 0; i < srcLen; i++) {
            boolean flg = false;
            if (src[i] == dst[0] && (i + dstLen <= srcLen)) {
                int count = 0;
                for (int j = 0 ; j < dstLen; j++) {
                    if (src[i+j] == dst[j]) {
                        count++;
                    }
                }
                if (count == dstLen) {
                    flg = true;
                }
            }
            if (flg) {
                return i;
            }
        }
        return -1;
    }

    //实现replaceAll
    public MyString replaceAll(char oldChar, char newChar) {
        char[] ret = this.toCharArray();
        for (int i = 0; i < this.length(); i++) {
            if (ret[i] == oldChar) {
                ret[i] = newChar;
            }
        }
        return new MyString(ret);
    }

    //实现replaceFirst
    public MyString replaceFirst(char oldChar, char newChar) {
        char[] ret = this.toCharArray();
        for (int i = 0; i < this.length(); i++) {
            if (ret[i] == oldChar) {
                ret[i] = newChar;
                break;
            }
        }
        return new MyString(ret);
    }

    //实现split
    public String[] split(String array, String target) {
        List<String> list = new ArrayList<>();
        while (array.contains(target)) {
            int index = array.indexOf(target);
            String temp = array.substring(0, index);
            list.add(temp);
            array = array.substring(index + target.length()); //substring(endIndex)删除endIndex之前的字符串
        }
        list.add(array);
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


    @Override
    public String toString() {
        return "MyString{" +
                "value=" + Arrays.toString(value) +
                '}';
    }
}
