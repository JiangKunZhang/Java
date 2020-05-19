import java.util.Arrays;
import java.util.Comparator;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/19 14:22
 */

class Person {
    public String name;
    public int age;
    public int score;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        //从小到大排序
        return o1.age - o2.age;
    }
}

class ScoreComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.score - o2.score;
    }
}

class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class TestComparator {

    //高级用法：使用Arrays.sort()方法传入比较器
    public static void main(String[] args) {
        Person person1 = new Person("aaa",18,80);
        Person person2 = new Person("bbb",28,70);
        Person person3 = new Person("ccc",38,60);
        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        ScoreComparator scoreComparator = new ScoreComparator();
        Arrays.sort(people,scoreComparator);
        System.out.println(Arrays.toString(people));
    }

    public static void main1(String[] args) {
        Person person1 = new Person("aaa",18,80);
        Person person2 = new Person("bbb",28,70);
        Person person3 = new Person("ccc",38,60);

        //使用比较器进行比较
        AgeComparator ageComparator = new AgeComparator();
        System.out.println("根据年龄比较");
        System.out.println(ageComparator.compare(person1,person2));
        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println("根据分数比较");
        System.out.println(scoreComparator.compare(person2,person3));
        NameComparator nameComparator = new NameComparator();
        System.out.println("根据姓名比较");
        System.out.println(nameComparator.compare(person3,person1));
    }
}
