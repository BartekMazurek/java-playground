package J8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Truck {
    public String name;
    public int topSpeed;

    public int seats;

    public int price;

    Truck(String name, int topSpeed, int seats, int price) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}

public class J2_StreamFilter {
    public static void main(String[] args) {

        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck 1", 200, 4, 1500000));
        trucks.add(new Truck("Truck 2", 150, 3, 1000000));
        trucks.add(new Truck("Truck 3", 130, 3, 1000000));
        trucks.add(new Truck("Truck 4", 110, 2, 900000));

        Stream<Truck> filteredTrucks = trucks.stream()
                .filter(element -> element.topSpeed > 110)
                .filter(element -> element.price >= 1000000)
                .filter(element -> element.seats > 3);

        filteredTrucks.forEach(truck -> System.out.println(truck.name));

        // COLLECT
        // ALLOWS TO GATHER FILTERED RESULTS FROM STREAM
        // ALTERNATIVE METHODS: toSet(), toMap()
        List<Truck> filteredTrucks2 = trucks.stream()
                .filter(element -> element.topSpeed > 110)
                .filter(element -> element.price >= 1000000)
                .filter(element -> element.seats > 3)
                .collect(Collectors.toList());

        ArrayList<Truck> filteredTrucks3 = new ArrayList<>(filteredTrucks2);
        filteredTrucks3.forEach(truck -> System.out.println(truck.name));

        // SUMMING INT
        // SUM ALL PROPERTIES OF GIVEN ELEMENT
        int priceSum = trucks.stream().collect(Collectors.summingInt(element -> element.price));
        System.out.println("Sum of prices: " + priceSum);

        // OBJECT METHOD REFERENCE IN MAP TO GET SPECIFIED VALUE
        List<Integer> prices = trucks.stream().map(Truck::getPrice).collect(Collectors.toList());
        System.out.println("Prices: " + prices);

        // MAX/MIN
        // GET SPECIFIED OBJECT WITH MAX/MIN VALUE FOR SPECIFIED PROPERTY
        Truck truckMaxPrice = trucks.stream().max(
                (truck1, truck2) -> truck1.price > truck2.price ? 1: -1
        ).get();

        System.out.println("Truck with max price: " + truckMaxPrice.name);

        Truck truckMinPrice = trucks.stream().min(
                (truck1, truck2) -> truck1.price > truck2.price ? 1: -1
        ).get();

        System.out.println("Truck with min price: " + truckMinPrice.name);
    }
}
