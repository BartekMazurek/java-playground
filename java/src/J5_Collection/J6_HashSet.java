package J5_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class J6_HashSet {
    // HASH SET
    // CALCULATE UNIQUE HASH FOR EVERY ELEMENT IN SET
    // ONLY UNIQUE ELEMENTS ALLOWED - COMPARE MEMORY REFERENCE FOR OBJECTS NOT OBJECT VALUES (!)
    // VERY QUICK
    // RANDOM ORDER OF ELEMENTS

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        String person1 = new String("John");
        String person2 = new String("Brad");
        String person3 = new String("Bart");
        String person4 = new String("Tom");

        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person4);
        hashSet.add(person4); // WON'T BE ADDED (DUPLICATE)

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
