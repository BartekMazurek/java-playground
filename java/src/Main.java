import J0_examples.DepositCalculator;
import J1_data.types.J1_byteShortIntLong;
import J1_data.types.J2_floatDouble;
import J1_data.types.J4_varType;

public class Main {
    public static void main(String[] args) {

        J1_byteShortIntLong.declare();

        J2_floatDouble.declare();

        J4_varType.declare(3, 4);

        DepositCalculator calculator = new DepositCalculator();
        calculator.calculate(6000, 180, 0.03f, 0.19f);
        float profitValue = calculator.getProfit();

        System.out.println("Profit value: " + profitValue);
    }
}
