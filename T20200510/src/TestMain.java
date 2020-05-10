import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-10
 * Time: 10:59
 */
public class TestMain {

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
    }


    public static void main4(String[] args) {
        Integer a = 10;//自动装箱

        int b = a;//自动拆箱

    }

    public static void main3(String[] args) {
        int i = 10;
        // 装箱操作，新建一个 Integer 类型对象，将 i 的值放入对象的某个属性中
        Integer ii = Integer.valueOf(i);
        Integer ij = new Integer(i);

        // 拆箱操作，将 Integer 对象中的值取出，放到一个基本数据类型中
        int j = ii.intValue();
        double d = ii.doubleValue();
    }

    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","宋江");
        map.put("及时雨","宋江");
        map.put("及时雨","宋江2");
        System.out.println(map);
        String s = map.getOrDefault("及时雨2","gaobo");
        System.out.println(s);

        System.out.println(map.containsKey("及时雨"));
        System.out.println(map.containsValue("宋江"));

        System.out.println("====================");

        Set<Map.Entry<String, String>> set = map.entrySet();

        for ( Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey()+" => " + entry.getValue());
        }

    }

    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //Collection collection2 = new LinkedList();
        collection.add("bit");
        collection.add("java");
        collection.add("gaobo");
        collection.add("火箭2");
        collection.add("老张");
        System.out.println(collection);

        System.out.println("=====================");
        for (String s :collection) {
            System.out.println(s);
        }

        /*collection.clear();
        System.out.println(collection);*/
        System.out.println(collection.isEmpty());
        collection.remove("java");
        System.out.println(collection);
        System.out.println(collection.size());

        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));

    }
}
