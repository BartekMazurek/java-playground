package J1_data.types;

public class J2_floatDouble {
    public static void declare() {

        // 4 bytes (32 bits), requires f at the end, 6-7 digits after coma
        float floatNumber = 34.55f;
        System.out.println("Float: 4 bytes (32 bits), requires f at the end, 6-7 digits after coma");

        // 8 bytes (64 bits), requires d at the end, 15 digits after coma
        double doubleNumber = 123.4325d;
        System.out.println("Double: 8 bytes (64 bits), requires d at the end, 15 digits after coma");
    }
}
