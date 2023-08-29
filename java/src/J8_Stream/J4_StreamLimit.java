package J8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J4_StreamLimit {
    public static void main(String[] args) {

        // LIMIT METHOD
        // LIMIT FILTER RESULTS
        List<Integer> integers = Arrays.asList(1, 2, 5, 8, 23, 56, 99);

        List<Integer> filteredIntegers = integers.
                stream().
                filter(element -> element > 10).
                limit(1). // DECREASE FILTER RESULTS INTO 1
                collect(Collectors.toList());

    }
}
