package J8_Stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class J3_StreamToMap {
    public static void main(String[] args) {

        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck 1", 200, 4, 1500000));
        trucks.add(new Truck("Truck 2", 150, 3, 1000000));
        trucks.add(new Truck("Truck 3", 130, 3, 1000000));
        trucks.add(new Truck("Truck 4", 110, 2, 900000));

        Map<String, Truck> trucksMap = trucks.stream().collect(
                Collectors.toMap(truck -> truck.name, truck -> truck)
        );

        System.out.println(trucksMap);
        System.out.println(trucksMap.get("Truck 2"));

    }
}
