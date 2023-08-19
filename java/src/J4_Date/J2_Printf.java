package J4_Date;

import java.util.Date;

public class J2_Printf {

    // TEXT FORMATTING RULES
    // %s - String
    // %d - integer
    // %f - real
    // %b - boolean
    // %t - date
    // %n - new line

    public static void main(String[] args) {
        System.out.printf("%d %f %b", 100, 1500.99f, true);

        System.out.printf("%n %tc", new Date());
    }
}
