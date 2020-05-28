/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/27 22:44
 */
public class TestObj{
    public static void main(String[] args){
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
}
