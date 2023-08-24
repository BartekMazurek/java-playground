package J5_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}

public class J9_HashMap {

    // HASHMAP
    // PROVIDES ASSOCIATION FUNCTIONALITY

    public static void main(String[] args) {
        HashMap<String, Car> hashMap = new HashMap<String, Car>();

        Car car1 = new Car("Ford");
        Car car2 = new Car("Honda");
        Car car3 = new Car("Audi");

        hashMap.put("Ford", car1);
        hashMap.put("Honda", car2);
        hashMap.put("Audi", car3);

        Car honda = hashMap.get("Honda");
        System.out.println(honda.getName());

        Iterator iterator = hashMap.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry car = (Map.Entry)iterator.next();
            System.out.println(car.getKey() + " - " + car.getValue());
        }

        for(Map.Entry<String, Car> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Car value = entry.getValue();

            System.out.println(key + " - " + value);
        }
    }
}
