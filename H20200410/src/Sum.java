/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 22:34
 * 计算1/1-1/2+1/3-1/4+1/5...+1/99-1/100
 */
public class Sum {
    public static void main(String[] args) {
        double temp = 1.0;
        double sum = 0;
        for(int i =1;i <= 100;i++) {
            sum = sum + (temp / i);
            temp = -temp;
        }
        System.out.println(sum);
    }
}
