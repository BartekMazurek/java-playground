package J5_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class J7_TreeSet {

    // TREE SET
    // PROPER FOR BIG COLLECTION OF DATA
    // ORDERED BY TREE DATA STRUCTURE
    // EVERY ELEMENT INSERTED SEQUENTIALLY (ASCENDING SORT)
    // INSERTING NEW ELEMENT IS SLOWER COMPARED TO HASHSET (TREE MUST BE REBUILT)

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        String person1 = new String("John");
        String person2 = new String("Anthony");
        String person3 = new String("Tom");
        String person4 = new String("Bart");

        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);

        Iterator<String> iterator = treeSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
