package J3_oop;

public class J1_Car {

    private String name;
    private String manufacturer;

    public J1_Car(
            String name,
            String manufacturer
    ) {
        // CONSTRUCTOR - DOES NOT RETURN ANYTHING
        // DEFINED MANUALLY INSTEAD AUTOMATICALLY BY COMPILATION
        // SAME NAME AS CLASS NAME
        // ALLOWED TO DEFINE MULTIPLE CONSTRUCTORS
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return this.name;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setName(String name) {
        // ARGUMENT name SET BY OBJECT MEMORY REFERENCE (ALL COMPLEX TYPES PASSED BY REFERENCE)
        // OTHER 'CALL BY VALUE' METHOD (PRIMITIVE ARGUMENTS ex. INT, BYTE BOOLEAN) - ARGUMENTS COPY PASSED INTO FUNCTION
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
