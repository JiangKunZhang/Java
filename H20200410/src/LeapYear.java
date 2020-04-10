import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 21:38
 * 判断闰年
 */
public class LeapYear {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int year = sc.nextInt();
        for(int year = 1000;year <= 2000;year++){
            if(((year % 4 == 0)&&(year % 100 != 0))||(year % 400 == 0)){
                System.out.println(year);
            }
        }
    }
}
