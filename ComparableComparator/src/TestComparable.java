/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/19 14:15
 */

class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
        //根据年龄比较
        //return this.name.compareTo(o.name);
    }

}


public class TestComparable {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",18);
        Student student2 = new Student("lisi",28);
        Student student3 = new Student("wangwu",38);
        if (student1.compareTo(student2) > 0) {
            System.out.println("student1的年龄大于student2的年龄");
        }else if (student1.compareTo(student2) < 0) {
            System.out.println("student1的年龄小于student2的年龄");
        }else {
            System.out.println("student1的年龄等于student2的年龄");
        }
    }
}
