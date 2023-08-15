package J3_oop;

public class J2_StaticExample {

    // OBJECT WITH STATIC PROPERTIES DOES NOT HAVE UNIQUE COPY OF STATIC PROPERTY
    // STATIC PROPERTY VALUE IS COMMON FOR ALL OBJECTS & CAN BE CHANGED
    // FINAL STATIC PROPERTY VALUES CAN'T BE CHANGED
    static String parameter = "some parameter value that can be changed";

    static final String secondParameter = "Second static parameter value that can't be changed";

    public static void someMethod() {
        System.out.printf("Some business logic with " + J2_StaticExample.parameter + " \n");
        System.out.printf("Some business logic with " + J2_StaticExample.secondParameter);
    }
}
