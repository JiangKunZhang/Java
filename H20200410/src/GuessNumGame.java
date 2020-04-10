import java.util.Random;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 23:41
 */
public class GuessNumGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = random.nextInt(100);
        System.out.println(num);
        while(true) {
            System.out.println("Please input guess number :(1-100)");
            int guess = scanner.nextInt();
            if(guess == num) {
                System.out.println("you win!!!");
                break;
            }
            if(guess > num) {
                System.out.println("too big!!!");
            }
            if(guess < num) {
                System.out.println("too small!!!");
            }
        }
    }
}
