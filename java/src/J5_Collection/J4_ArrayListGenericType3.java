package J5_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class J4_ArrayListGenericType3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Integer number1 = 999;
        Integer number2 = 1;
        Integer number3 = Integer.valueOf(300);

        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);

        Collections.sort(numbers); // SORT NUMBERS IN COLLECTION

        Iterator iterator = numbers.iterator();

        while(iterator.hasNext()) {
            Integer i = (Integer)iterator.next();
            System.out.println(i);
        }
    }
}
