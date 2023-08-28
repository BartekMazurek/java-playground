package J7_Lambda;

interface Substraction <T> {
    T substract(T a, T b);
    // FUNCTIONAL INTERFACE WITH GENERIC TYPE
    // FUNCTIONAL INTERFACE IS ALLOWED FOR ONLY ONE ABSTRACT METHOD
}

public class J2_LambdaExpression2 {
    public static void main(String[] args) {
        
        Substraction<Integer> substraction = (Integer a, Integer b) -> {
            return a - b;
        };

        int substractionResult = substraction.substract(20, 10);

        System.out.println("Substraction result: " + substractionResult);
        
    }
}
