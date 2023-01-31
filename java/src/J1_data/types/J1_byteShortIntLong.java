package J1_data.types;

public class J1_byteShortIntLong {

    public static void declare() {

        // 1 byte (8 bits), -128 - 127
        byte byteNumber = 12;
        System.out.println("Byte: 1 byte (8 bits), -128 - 127");

        // 2 bytes (16 bits), -32768 - 32767
        short shortNumber = 32000;
        System.out.println("Short: 2 bytes (16 bits), -32768 - 32767");

        // 4 bytes(32 bits), -2147483648 - 2147483647
        int integerNumber = -140000;
        System.out.println("Integer: 4 bytes(32 bits), -2147483648 - 2147483647");

        // 8 bytes(64 bits), - 9223372036854775808 - 9223372036854775807
        long longNumber = 994562L;
        System.out.println("Long: 8 bytes(64 bits), - 9223372036854775808 - 9223372036854775807");
    }
}
