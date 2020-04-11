/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 23:00
 * 0-999的水仙花数
 */
public class Flower {
    public static void main(String[] args) {
        int temp = 0;
        int sum = 0;
        for(int i = 0;i <= 999 ;i++) {
            temp = i;
            sum = 0;
            while(temp > 0){
                //sum = sum +(int)Math.pow((temp % 10),3);
                sum += Math.pow((temp % 10),3);
                //为什么这种就不用转int??????????????
                temp = temp / 10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
