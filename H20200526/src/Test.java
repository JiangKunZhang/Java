/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 22:38
 */
public class Test {
    public String name="abc";
    public static void main(String[] args){
        Test test=new Test();
        Test testB=new Test();
        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
    }
}
