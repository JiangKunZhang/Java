/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/10 21:56
 * 乘法口诀表
 */
public class MultTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for(int  j = 1; j <= i; j++) {
                System.out.print(i+" * "+j +" = "+i * j + "  ");
            }
            System.out.println();
        }
    }
}
