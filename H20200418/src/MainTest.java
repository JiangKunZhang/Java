import java.security.spec.ECField;
import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/19 9:56
 */
public class MainTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10,20));
        System.out.println(calc.sub(10,20));
        System.out.println(calc.mol(10,20));
        System.out.println(calc.div(10,20));
        System.out.println("=============================");

        Person person = new Person();
        Person person1 = new Person("zhangsan");
        Person person2 = new Person("lisi",18);
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("=============================");

        Exchange change = new Exchange(1,2);
        System.out.println(change);
        change.exchange();
        System.out.println(change);
        System.out.println("=============================");

        int[] array = {1,2,3,4,5,6,7,8,9};
        OddEvenChange arr = new OddEvenChange(array);
        System.out.println(arr);
        arr.change();
        System.out.println(arr);
        System.out.println("=============================");

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};
        ArrayChange arr1 = new ArrayChange(array1);
        ArrayChange arr2 = new ArrayChange(array2);
        System.out.println(arr1);
        System.out.println(arr2);
        arr1.setArray(array2);
        arr2.setArray(array1);
        System.out.println(arr1);
        System.out.println(arr2);

    }
}
