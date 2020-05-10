package com.demo1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-10
 * Time: 15:48
 */
class A {

}
class B extends A {

}
class C extends B {

}
class Person {

}
public class TestDemo {


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        System.out.println("================");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList);
    }

    public static void main4(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        //myArrayList.add("hello");
        myArrayList.add(2);
        myArrayList.add(3);

        int val = myArrayList.getVal(1);
        System.out.println(val);

        MyArrayList<String> myArrayList2 = new MyArrayList<>();

        myArrayList2.add("hello");

    }

    public static void main3(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("hello");
        myArrayList.add(2);

        int val = (int)myArrayList.getVal(1);
        System.out.println(val);
    }




    public static void main2(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                StringBuffer ret = new StringBuffer();
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);//'a'
                    String tmp = ret.toString();
                    if(!tmp.contains(ch+"")) {//"a"
                        ret.append(ch);
                    }
                }
                System.out.println(ret);
            }
    }



    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main1(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}
