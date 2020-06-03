package Fibonacci数列;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/3 18:55
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[32];
        int f1 = 0,f2 = 1,f3 = 1;
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < 32; i++) {
            f3 = f2 + f1;
            array[i] = f3;
            f1 = f2;
            f2 = f3;
        }
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (n < array[i]) {
                index = i;
                break;
            }
        }
        int a = array[index] - n;
        int b = n - array[index - 1];
        int res = a > b ? b : a;
        System.out.println(res);
    }
}
