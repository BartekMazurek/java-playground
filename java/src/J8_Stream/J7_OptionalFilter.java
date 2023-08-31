package J8_Stream;

import java.util.Optional;

public class J7_OptionalFilter {

    public static void main(String[] args) {

        // OPTIONAL WITH FILTER
        // FILTER DATA WITH LAMBDA EXPRESSION OR RETURN OPTIONAL DATA WITH orElse()
        //String string = "Some test string";
        String string = null;

        Optional<String> optional = Optional.ofNullable(string);
        String optionalText = optional.
                filter(text -> text.length() > 5).
                or(() -> Optional.ofNullable("Alternative text if null")).
                map(String::toUpperCase).
                orElse("Short default text");

        System.out.println(optionalText);
    }
}
