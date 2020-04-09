public class TestDemo {

    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int ret = 1;
        int sum = 0;
        while(i <= num) {
            ret *= i;
            sum += ret;
            i++;
        }
        System.out.println(sum);
    }

    public static void main2(String[] args) {

        int i=10;
        i=i++;
        System.out.println(i);

    }
    public static void main1(String[] args) {
        System.out.println(10%3);
        System.out.println(-10%3);
        System.out.println(10%-3);
        System.out.println(-10%-3);
    }
    
}