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

    // OVERWRITTEN METHODS
    // JAVA ALLOWS TO DEFINE MORE THAN ONE METHOD WITH SAME NAME
    // METHODS SHOULD BE DIFFERENT (ARGUMENTS AMOUNT ETC.)
    // EXACT SAME METHODS WILL TRIGGER COMPILATION ERROR
    // JAVA WILL KNOW INTERNALLY WHAT METHOD SHOULD BE CALLED

    public int overwrittenMethodExample(int a, int b) {
        return a + b;
    }

    public float overwrittenMethodExample(float a, float b) {
        return a + b;
    }

    public float overwrittenMethodExample(float a, float b, float c) {
        return a + b + c;
    }
}
