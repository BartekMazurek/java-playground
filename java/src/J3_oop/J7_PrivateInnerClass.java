package J3_oop;

public class J7_PrivateInnerClass {
    private static class InnerClass {
        public void getInfo() {
            System.out.printf("Inner class message");
        }
    }

    public static void main(String[] args) {
        InnerClass test = new InnerClass();
        test.getInfo();
    }
}
