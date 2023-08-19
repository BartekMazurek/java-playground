package J4_Date;

import java.time.LocalTime;

public class J3_LocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println("Hour:" + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Seconds: " + time.getSecond());

        System.out.println("Modified hour: " + time.minusHours(2));
        System.out.println("Modified minutes: " + time.minusMinutes(20));
    }
}
