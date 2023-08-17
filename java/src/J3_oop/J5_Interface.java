package J3_oop;

// CAN CONTAIN STATIC METHODS & CONST
// VARIABLES CONVERTED INTO STATIC FINAL AUTOMATICALLY
// CAN EXTEND OTHER INTERFACES

interface VehicleInterface {
    void getName();

    abstract void getMaxSpeed();
}

class Bus implements VehicleInterface {

    private String name;
    private int maxSpeed;

    Bus() {
        this.name = "Bus";
        this.maxSpeed = 150;
    }

    @Override
    public void getName() {
        System.out.printf("Name: " + this.name);
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Max speed: " + this.maxSpeed);
    }
}

public class J5_Interface {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.getName();
    }
}
