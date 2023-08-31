package J8_Stream;

import java.util.Optional;

public class J5_Optional {

    // OPTIONAL
    // ADDED IN JAVA 8 TO PREVENT NULL POINTER EXCEPTION

    public static void main(String[] args) {
        String[] strings = new String[3]; // ALLOCATE MEMORY FOR 3 STRING ELEMENTS - SET 3 X NULL
        strings[0] = "Test0";
        strings[2] = "Test2";

        Optional<String> text0 = Optional.ofNullable(strings[0]);
        Optional<String> text1 = Optional.ofNullable(strings[1]);

        if (text0.isPresent()) {
            System.out.println("Text0 is present: " + text0.get());
        } else {
            System.out.println("Text0 is NOT present");
        }

        text0.ifPresent(element -> System.out.println("Present: " + element));

        if (text1.isPresent()) {
            System.out.println("Text1 is present: " + text1.get());
        } else {
            System.out.println("Text1 is NOT present");
        }
    }
}
