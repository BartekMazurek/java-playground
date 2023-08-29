package J8_Stream;

import java.util.ArrayList;

public class J1_Stream {

    public static void main(String[] args) {

        // STREAMS
        // GENERIC INTERFACE WITH DATA TYPE FROM STREAM
        // ALLOWS EASY ITERATION & MANIPULATION WITH COLLECTION ELEMENTS
        // CONTAINS METHODS: forEach, map, filter etc.

        ArrayList<String> persons = new ArrayList<>();
        persons.add("John");
        persons.add("Max");
        persons.add("Donald");
        persons.add("Nicolas");

        persons.stream().forEach(element-> System.out.println(element));

        long filteredPersonsAmount = persons.stream().filter(element-> element.length() > 3).count();
        System.out.println(filteredPersonsAmount);

    }

}
