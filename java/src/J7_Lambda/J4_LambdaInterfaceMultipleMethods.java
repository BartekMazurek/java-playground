package J7_Lambda;

@FunctionalInterface
interface MathInterface {

    // FUNCTIONAL INTERFACE
    // ALLOWED TO HAVE ONLY ONE ABSTRACT METHOD
    // CAN CONTAIN MULTIPLE DEFAULT OR STATIC METHODS
    int operate(int a, int b);

    // DEFAULT CLAUSE
    // SET METHOD DEFAULT BODY - CLASS THAT IMPLEMENTS INTERFACE WON'T BE FORCED TO IMPLEMENT THIS METHOD
    default int add(int a, int b) {
        return a + b;
    }

    default int substract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class J4_LambdaInterfaceMultipleMethods {
    public static void main(String[] args) {

        MathInterface math = (int a, int b) -> a + b; // WILL AUTOMATICALLY USE INTERFACE "OPERATE" METHOD

        System.out.println(math.operate(10, 20)); // 30
        System.out.println(math.substract(20, 10)); // 10
        System.out.println(MathInterface.multiply(10, 10)); // 100
    }
}
