/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/19 9:49
 */
public class Calculator {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator() {

    }

    @Override
    public String toString() {
        return "Calculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public int add(int num1 ,int num2 ){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 + this.num2;
    }
    public int sub(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 - this.num2;
    }
    public int mol(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 * this.num2;
    }
    public int div(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 / this.num2;
    }

}
