package J6_GenericProgramming;

import java.util.ArrayList;

class Helper {
    public static <T> void print(ArrayList<T> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

public class J3_GenericTypeMethod {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        String car1 = new String("Car1");
        String car2 = new String("Car2");
        String car3 = new String("Car3");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Helper.print(cars);
    }
}
