package J1_data.types;

public class J7_array {

    public static void declare() {

        // SINGLE DIMENSION ARRAYS
        int[] array = new int[8];

        System.out.println("Array length: " + array.length);
        System.out.println("Array second element value: " + array[1]);

        int[] secondArray = {10, 20, 99, 300};
        System.out.println("Second array length: " + secondArray.length);
        System.out.println("Second array third element value: " + secondArray[2]);

        // MULTI DIMENSION ARRAYS
        int[][] thirdArray = new int[3][10];

        String[][] fourthArray = {
                {"first", "second", "third", "fourth"},
                {"fifth", "sixth", "seventh", "eight"}
        };
    }
}
