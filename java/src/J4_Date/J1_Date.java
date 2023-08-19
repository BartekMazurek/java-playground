package J4_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class J1_Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date: " + date.toString());

        long millisecondsSince1970 = date.getTime();
        System.out.println(millisecondsSince1970);

        // SIMPLE DATE FORMAT
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
        System.out.println(simpleFormat.format(date));
    }
}
