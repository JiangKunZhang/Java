/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 22:47
 * 1-100中9的个数
 */
public class Nine {
    public static void main(String[] args) {
        int temp,count=0;
        for(int i = 1;i <= 100;i++) {
            temp = i;
            while(temp > 0){
                if(temp % 10 == 9){
                    count++;
                }
                temp = temp / 10;
            }

        }
        System.out.println(count);
    }
}
