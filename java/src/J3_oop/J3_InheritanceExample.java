package J3_oop;

class Vehicle {
    protected String type;
    protected String color;

    Vehicle() {
        this.type = "Unknown";
        this.color = "Unknown";
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getType() {
        return this.type;
    }

    protected String getColor() {
        return this.color;
    }
}

class Car extends Vehicle {
    protected String name;
    protected String model;

    Car() {
        this.name = "Unknown";
        this.model = "Unknown";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}

public class J3_InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.setType("Car");
        car.setColor("Magenta");
        car.setName("Ford");
        car.setModel("Mustang");

        System.out.printf(car.getType() + "\n");
        System.out.printf(car.getColor() + "\n");
        System.out.printf(car.getName() + "\n");
        System.out.printf(car.getModel());
    }
}
