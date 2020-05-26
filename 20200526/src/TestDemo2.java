import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/26 20:30
 */
public class TestDemo2 {


    /**
     * 3、10万个数据，统计重复数字及出现的次数
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        //key -> 关键字重复的数字
        //value -> 重复的数字出现的次数
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        System.out.println(list);
        int i = 1;
        for (Integer key : list) {
            if (map.get(key) == null) {//如果是第一次，那getKey得到的就是null
                map.put(key,1);
            }else {//不为空就是有，拿出value加1，再放进去
                int val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "这个数字出现了" + entry.getValue() + "次");
        }
        System.out.println(map);

    }

    /**
     * 大数据去重
     * @param args
     */
    public static void main2(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        for (Integer val : list) {
            set.add(val);
        }
    }

    /**
     * 1、找出10W个数据当中，第一个重复的元素。
     * @param args
     */
    public static void main1(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }

        for (Integer val : list) {
            if (!set.contains(val)) {
                set.add(val);
            }else {
                System.out.println(val);
                break;
            }
        }

    }
}
