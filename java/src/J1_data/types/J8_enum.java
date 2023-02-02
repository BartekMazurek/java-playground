package J1_data.types;

public class J8_enum {

    enum ShoesSize {S, M, L, XL};

    public static void declare() {

        ShoesSize nikeShoesSize = ShoesSize.XL;

        System.out.println("Nike shoes size: " + nikeShoesSize);
    }
}
