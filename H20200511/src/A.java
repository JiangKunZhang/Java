/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/13 16:22
 */
public class A<T> {
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}