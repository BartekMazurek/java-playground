package J2_big.numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class J2_bigNumbers {

    public static void declare() {

        // add, subtract, multiply, divide etc.
        BigInteger bigNumber = new BigInteger("111111111111134567891111111111111");

        bigNumber = bigNumber.add(new BigInteger("22222222222287672342222222222222"));

        System.out.println("Big integer: " + bigNumber);

        BigDecimal bigDecimalNumber = new BigDecimal("1500.123412341234232112355333");
        bigDecimalNumber = bigDecimalNumber.multiply(new BigDecimal("99.12112355333"));

        System.out.println("Big decimal number: " + bigDecimalNumber);
    }
}
