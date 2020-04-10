/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 20:12
 * 1-100的素数
 */
public class PrimeTable {
    public static void main(String[] args) {
        int i,j;
        for(i = 1;i <= 100;i++){
            for(j = 2;j < i;j++){
                if(i % j == 0){
                    break;
                }
            }
            if(i == j){
                System.out.println(i);
            }
        }
    }
}
