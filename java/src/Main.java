import J0_examples.CompoundInterestCalculator;
import J0_examples.DepositCalculator;
import J1_data.types.*;
import J2_big.numbers.J1_math;
import J2_big.numbers.J2_bigNumbers;
import J3_oop.J2_CarFinal;

public class Main {
    public static void main(String[] args) {

        // TYPES
        //J1_byteShortIntLong.declare();

        //J2_floatDouble.declare();

        //J4_varType.declare(3, 4);

        //DepositCalculator calculator = new DepositCalculator();
        //calculator.calculate(6000, 180, 0.03f, 0.19f);
        //float profitValue = calculator.getProfit();

        //System.out.println("Profit value: " + profitValue);

        //J6_string.declare();

        //J7_array.declare();

        //J8_enum.declare();

        // BIG NUMBERS
        //J1_math.calculate();

        //J2_bigNumbers.declare();

        // COMPOUND INTEREST CALCULATOR
        //CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        //calculator.calculate();

        J2_CarFinal finalExample = new J2_CarFinal("Some test name");
        System.out.printf(finalExample.getName());
    }
}
