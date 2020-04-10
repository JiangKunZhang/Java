import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 19:33
 * 简单分支判断
 */
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 18) {
            System.out.println("是少年");
        }else if((age >= 19)&&(age < 28)){
            System.out.println("是青年");
        } else if ((age >= 29)&&(age < 55)) {
            System.out.println("是中年");
        }else if(age >= 56){
            System.out.println("是老年");
        }
    }
}
