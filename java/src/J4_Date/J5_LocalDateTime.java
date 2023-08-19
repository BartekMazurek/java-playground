package J4_Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class J5_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(localDateTime.format(format));
    }
}
