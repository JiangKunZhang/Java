import com.sun.javaws.IconUtil;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/10 8:57
 */
public class TestDemo {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民老公","王思聪");
        map.put("国民女神","王丽坤");
        map.put("比特","鹏哥");
        map.put("比特","博哥");
        System.out.println(map);
        System.out.println(map.get("比特"));
        System.out.println(map.getOrDefault("及时雨","宋江"));
        System.out.println(map.containsKey("国民女神"));
        System.out.println(map.containsValue("博哥"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        Set<Map.Entry<String,String>> set = map.entrySet();
        System.out.println(set);
        for (Map.Entry<String,String> entry : set) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        map.clear();
        System.out.println(map);
    }

    public static void main2(String[] args) {
        Collection<Integer> collection = new PriorityQueue<>();
        collection.add(6);
        collection.add(5);
        collection.add(4);
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.remove(6);
        System.out.println(collection);
    }

    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("zhang");
        collection.add("wang");
        collection.add("li");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        collection.remove("zhang");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
    }
}
