package J3_oop;

class BaseClass {

    protected String someArgument;

    BaseClass() {
        this.someArgument = "Unknown";
    }

    BaseClass(String someArgument) {
        this.someArgument = someArgument;
    }

    public void printArgument() {
        System.out.printf(this.someArgument);
    }
}

class ChildClass extends BaseClass {

    ChildClass(String someArgument) {
        super(someArgument);
    }

    public void printArgument() {
        super.printArgument();
    }
}

public class J4_Super {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("value");
        childClass.printArgument();
    }
}
