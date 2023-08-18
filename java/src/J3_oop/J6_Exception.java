package J3_oop;

import java.util.Arrays;

public class J6_Exception {
    public static void main(String[] args) {

        try {
            // DIVISION BY 0 TO TRIGGER EXCEPTION
            int result = (10/0);
        } catch (ArithmeticException e) {
            System.out.printf("Exception: " + e.getMessage());
            System.out.printf("Stack trace: " + Arrays.toString(e.getStackTrace()));
        }
    }
}
