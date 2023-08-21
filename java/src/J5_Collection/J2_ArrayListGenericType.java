package J5_Collection;

import java.util.ArrayList;

public class J2_ArrayListGenericType {
    public static void main(String[] args) {

        // ARRAY LIST IS GENERIC TYPE CLASS WITH PARAMETER TYPES
        ArrayList<String> persons = new ArrayList<String>();

        String person1 = new String("Person1");
        String person2 = new String("Person2");
        String person3 = new String("Person3");

        persons.add(person1); // ADD REQUIRE STRING TYPE OBJECT
        persons.add(person2);
        persons.add(person3);

        System.out.println(persons);

        persons.remove(0);

        String person = persons.get(0); // GET WILL RETURN STRING TYPE

        System.out.println(person);
    }
}
