import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/26 21:15
 */
public class TestDemo3 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            if (!set.contains(val)) {
                set.add(val);
            }else {
                set.remove(val);
            }
        }
        return set.iterator().next();

    }
}
