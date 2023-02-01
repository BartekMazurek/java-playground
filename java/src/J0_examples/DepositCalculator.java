package J0_examples;

public class DepositCalculator {

    private float deposit;
    private float days;
    private float interest;
    private float interestRate;
    private float tax;
    private float taxValue;
    private float profit;
    private int daysInYear;

    public DepositCalculator() {
        this.deposit = 0.0f;
        this.days = 0.0f;
        this.interest = 0.0f;
        this.interestRate = 0.0f;
        this.tax = 0.0f;
        this.taxValue = 0.0f;
        this.profit = 0.0f;
        this.daysInYear = 365;
    }

    public void calculate(float deposit, float days, float interestRate, float tax) {
        this.setDeposit(deposit);
        this.setDays(days);
        this.setInterestRate(interestRate);
        this.setTax(tax);
        this.calculateInterest();
        this.calculateTaxValue();
        this.calculateProfit();
    }

    public float getProfit() {
        return this.profit;
    }

    private void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    private void setDays(float days) {
        this.days = days;
    }

    private void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    private void setTax(float tax) {
        this.tax = tax;
    }

    private void calculateInterest() {
        this.interest = (this.deposit * this.days * this.interestRate) / this.daysInYear;
    }

    private void calculateTaxValue() {
        this.taxValue = this.interest * this.tax;
    }

    private void calculateProfit() {
        this.profit = this.interest - this.taxValue;
    }
}
