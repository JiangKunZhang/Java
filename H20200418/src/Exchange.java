/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/19 10:07
 */
public class Exchange {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Exchange(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public void exchange() {
        int temp = this.num1;
        this.num1 = this.num2;
        this.num2 = temp;
    }
}
