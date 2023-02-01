package J1_data.types;

public class J4_varType {

    public static void declare(int first, int second) {

        // VAR TYPE (FROM JAVA 10) - COMPILER WILL AUTOMATICALLY SET VARIABLE TYPE FOR LOCAL FUNCTION VARIABLE
        var result = first + second;

        System.out.println(result);
    }
}
