package J7_Lambda;

import java.util.Arrays;

public class J3_LambdaArraySort {

    public static void main(String[] args) {

        String[] persons = {"John", "Tom", "Bart", "Max", "Donald"};

        // LAMBDA CAN BE USED AS SECOND ARGUMENT IN EX. ARRAY SORT FUNCTION
        Arrays.sort(persons, (first, second) -> first.length() - second.length());

        for(String person: persons) {
            System.out.println(person);
        }

    }

}
