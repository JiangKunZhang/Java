package q658_找到K个最接近的元素;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/28 8:27
 */
public class Solution{
    public List<Integer> findClosestElements (int[] arr, int k, int x) {
        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(ret, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
        ret = ret.subList(0, k);
        Collections.sort(ret);
        return ret;

    }
}
