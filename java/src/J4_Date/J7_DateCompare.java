package J4_Date;

import java.time.LocalDate;

public class J7_DateCompare {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 5, 10);
        LocalDate date2 = LocalDate.of(2023, 8, 20);

        if (date2.isAfter(date1)) {
            System.out.println("Date 2 after date 1");
        }

        if (date2.isBefore(date1)) {
            System.out.println("Date 2 before date 1");
        }

        if (date2.isEqual(date1)) {
            System.out.println("Date 2 is equal date 1");
        }
    }
}
