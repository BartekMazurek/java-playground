package J1_data.types;

public class J6_string {

    public static void declare() {

        String first = "First";
        String second = new String("Second");

        String third = first.toUpperCase() + second.toLowerCase();

        System.out.println(third);
    }

}
