import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/16 22:41
 */
public class TestDemo2 {

    public static void main(String[] args) {
        int[][] array1 = new int[2][3];
        int[][] array2 = {{1,2,3},{4,5,6}};

        //不规则二维数组

        //注意：C语言  是可以指定列  行可以自动推导
        // Java  行必须指定    列  不可以自动推导的
        int[][] array3 = new int[2][];
        array3[0] = new int[]{1, 2, 3, 4};
        array3[1] = new int[]{4, 5};
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepToString(array3));

        //二维数组的打印方式
        for (int i = 0;i < array3.length;i++) {
            for (int j = 0;j < array3[i].length;j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }

}
