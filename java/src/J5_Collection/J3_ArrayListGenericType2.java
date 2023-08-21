package J5_Collection;

import java.util.ArrayList;

class Person {
    String name = "Unknown";

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class J3_ArrayListGenericType2 {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person person1 = new Person("John");
        Person person2 = new Person("Walt");
        Person person3 = new Person("Mark");
        Person person4 = new Person("Bart");

        persons.add(person1);
        persons.add(person2);

        System.out.println(persons);

        for (Person p: persons) {
            System.out.println(p.getName());
        }

        persons.set(0, person3); // SET NEW OBJECT UNDER SPECIFIED ELEMENT

        persons.add(1, person4); // ADD NEW ELEMENT UNDER SPECIFIED INDEX AND MOVE OTHER ELEMENTS INTO NEW INDEXES

        for (Person p: persons) {
            System.out.println(p.getName());
        }
    }
}
