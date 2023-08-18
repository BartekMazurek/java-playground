package J3_oop;

public class J8_PublicStaticInnerClass {

    private String firstValue;
    private String secondValue;

    public void getFirstValue() {
        System.out.printf("First value:" + this.firstValue);
    }

    public void getSecondValue() {
        System.out.printf("Second value: " + this.secondValue);
    }

    public static class Builder {
        J8_PublicStaticInnerClass example = new J8_PublicStaticInnerClass();

        public Builder setFirstValue(String firstValue) {
            example.firstValue = firstValue;

            return this;
        }

        public Builder setSecondValue(String secondValue) {
            example.secondValue = secondValue;

            return this;
        }

        public J8_PublicStaticInnerClass getExample() {
            return example;
        }
    }
}
