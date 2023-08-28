package J7_Lambda;

interface Addition {
    public int add(int a, int b); // FUNCTIONAL INTERFACE (HAS ONLY ONE METHOD)
}

public class J1_LambdaExpression {
    public static void main(String[] args) {

        // LAMBDA EXPRESSION
        // BLOCKS OF CODE THAT CAN BE ASSIGNED INTO VARIABLE TO REUSE IN THE FUTURE
        // CODE AFTER -> IS INTERFACE METHOD BODY WITH LOGIC
        Addition addition = (int a, int b) -> a + b;

        int result = addition.add(10, 20);

        System.out.println("Addition: " + result);

    }
}
