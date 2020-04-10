import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 23:16
 * 模拟三次密码输入
 */
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "123";
        int  i = 0;
        while(i<3){
            String input = sc.nextLine();
            if(input.equals(password)){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("密码错误");
            }
            i++;
        }
    }
}
