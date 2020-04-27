
import com.bit.demo2.Animal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-27
 * Time: 10:28
 */

public class TestDemo extends Animal {

    public  void func() {
        Animal animal = new Animal();
        //System.out.println(animal.name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {

    }
}
