package J8_Stream;

import java.util.Optional;

public class J6_OptionalMap {
    public static void main(String[] args) {

        // OPTIONAL WITH MAP EXAMPLE

        Integer integer = Integer.valueOf(1000);
        //Integer integer = null;

        Optional<Integer> optional = Optional.ofNullable(integer);

        Optional<Integer> result = optional.map(element -> element * 2); // map will execute code if element is not null

        System.out.println("Result: " + result); //Optional.empty if integer = null
        System.out.println("Result or else: " + result.orElse(0)); // 0 if integer = null, 2000 if integer = 1000
    }
}
