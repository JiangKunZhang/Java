package com.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/11 19:51
 */
public class TestDemo {
    public static List<Character> func(String str1, String str2) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch + "")) {
                list.add(ch);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> list = func(str1,str2);
        System.out.println(list);
    }
}
