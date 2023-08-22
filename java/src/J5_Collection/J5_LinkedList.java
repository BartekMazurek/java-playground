package J5_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class J5_LinkedList {

    // LINKED LIST
    // MORE EFFICIENT THAN ARRAY LIST
    // IS BIDIRECTIONAL LIST
    // EVERY LIST ELEMENT HAS REFERENCE INTO PREVIOUS & NEXT ELEMENT
    // IS QUICKER THAN NORMAL ARRAY BECAUSE AFTER INSERT/REMOVE ELEMENT ONLY TWO OBJECTS NEED TO BE UPDATED WITH REFERENCE
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        String person1 = new String("John");
        String person2 = new String("Bart");
        String person3 = new String("Walt");
        String person4 = new String("Brad");

        list.add(person2);
        list.addFirst(person1);
        list.addLast(person3);
        list.addLast(person4);

        System.out.println(list);

        Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        list.clear();

        System.out.println(list);

    }

}
