/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/12 22:19
 * 汉诺塔
 */
public class Hanoi {

    public static void hanoi(int n,char origin,char assist,char destination) {
        if (n == 1) {
            move(origin,destination);
        } else {
            hanoi(n-1,origin,destination,assist);
            move(origin,destination);
            hanoi(n-1,assist,origin,destination);
        }
    }

    public static void move(char origin,char destination) {
        System.out.println(origin + "--->" + destination);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(3,'a','b','c');
    }
}
