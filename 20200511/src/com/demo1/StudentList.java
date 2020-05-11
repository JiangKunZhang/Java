package com.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/11 19:15
 */

class Student {
    private String name;
    private String classes;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}

public class StudentList {

    public static void main(String[] args) {
        Student student1 = new Student("zhagnsan", "一班", 80.0);
        Student student2 = new Student("lisi", "二班", 90.0);
        Student student3 = new Student("wangwu", "三班", 100.0);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("=====================================");

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        list1.add(1);
        Collections.sort(list1);
        System.out.println(list1);
    }

}
