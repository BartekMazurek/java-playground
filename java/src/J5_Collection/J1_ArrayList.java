package J5_Collection;

import java.util.ArrayList;

public class J1_ArrayList {

    public static void main(String[] args) {

        // MORE EFFICIENT THAN SIMPLE ARRAYS
        ArrayList persons = new ArrayList();

        String person1 = "Person1";
        String person2 = "Person2";
        String person3 = "Person3";

        persons.add(person1); // ADD WILL REQUIRE OBJECT TYPE
        persons.add(person2);
        persons.add(person3);

        System.out.println(persons);

        persons.remove(0);

        Object object = persons.get(0); // GET WILL RETURN OBJECT TYPE
        String person = (String) object;

        System.out.println(person);
    }

}
