package J4_Date;

import java.time.LocalDate;

public class J4_LocalDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Current date: " + localDate);
        System.out.println("Current day of month: " + localDate.getDayOfMonth());
        System.out.println("Current day of week: " + localDate.getDayOfWeek());
        System.out.println("Current day of year: " + localDate.getDayOfYear());
        System.out.println("Current month: " + localDate.getMonth());
        System.out.println("Current year: " + localDate.getYear());
        System.out.println("Current month number: " + localDate.getMonthValue());
    }
}
