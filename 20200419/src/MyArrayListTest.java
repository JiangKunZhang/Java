import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/19 16:03
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        //arrayList.add(0,1);
        for(int i = 0;i < 21;i++) {
            arrayList.add(i,i);
        }
        //System.out.println(Arrays.toString(arrayList.elem));
        arrayList.display();
        arrayList.add(21,21);
        //System.out.println(Arrays.toString(arrayList.elem));
        arrayList.display();
        System.out.println(arrayList.contains(21));
        System.out.println(arrayList.search(21));
        System.out.println(arrayList.getPos(22));
        System.out.println(arrayList.size());
        arrayList.romove(21);
        arrayList.display();
        System.out.println("clear");
        arrayList.clear();
        arrayList.display();

    }
}
