package q75_颜色分类;

import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/24 21:12
 */
public class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        if (nums.length < 2) return;
        int zero = 0;
        int two = nums.length;
        int i = 0;
        while (i < two) {
            if (nums[i] == 0) {
                swap(nums,i,zero);
                zero++;
                i++;
            }else if (nums[i] == 1) {
                i++;
            }else {
                two--;
                swap(nums,i,two);
            }
        }
    }
    public void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
