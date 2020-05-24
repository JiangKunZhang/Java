package q853_车队;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/24 21:40
 */

class Car {
    int position;
    double time;
    public Car(int position, double time) {
        this.position = position;
        this.time = time;
    }
}

class CarsCompare implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.position - o2.position;
    }
}

public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        Car[] cars = new Car[len];
        for (int i = 0; i < position.length; i++) {
            cars[i] = new Car(position[i], (double)(target - position[i]) / speed[i]);
        }
        Arrays.sort(cars,new CarsCompare());
        int res = 0, t = len;
        while (--t > 0) {
            if (cars[t].time < cars[t - 1].time) {
                res++;
            }else {
                cars[t - 1] = cars[t];
            }
        }
        int tmp = t == 0 ? 1 : 0;
        return res + tmp;
    }


}
