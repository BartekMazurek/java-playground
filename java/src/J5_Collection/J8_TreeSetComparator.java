package J5_Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Human {
    private String name;
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class TreeSetComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        String o1Name = o1.getName();
        String o2Name = o2.getName();

        return o1Name.compareTo(o2Name);
    }
}

public class J8_TreeSetComparator {
    public static void main(String[] args) {

        TreeSet<Human> treeSet = new TreeSet<>(new TreeSetComparator());

        Human person1 = new Human("John");
        Human person2 = new Human("Anthony");
        Human person3 = new Human("Tom");
        Human person4 = new Human("Bart");

        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);

        Iterator<Human> iterator = treeSet.iterator();

        while(iterator.hasNext()) {
            Human person = iterator.next();

            System.out.println(person.getName());
        }
    }
}
