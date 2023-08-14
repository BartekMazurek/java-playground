package J0_examples;

import java.util.Scanner;

public class CompoundInterestCalculator {

    private double capitalAmount;
    private double yearInterestRate;
    private int years;
    private final Scanner input;

    public CompoundInterestCalculator() {
        this.input = new Scanner(System.in);
    }

    public void calculate() {
        this.showMessage("Set start capital amount:");
        this.capitalAmount = Double.parseDouble(this.input.nextLine());

        this.showMessage("Set interest rates:");
        this.yearInterestRate = Double.parseDouble(this.input.nextLine());

        this.showMessage("Set saving years amount:");
        this.years = this.input.nextInt();

        this.showMessage("Compound interest calculator result:" + this.calculateCapitalAmount());
    }

    private void showMessage(String message) {
        System.out.printf(message);
    }

    private long calculateCapitalAmount() {
        return Math.round(this.capitalAmount * Math.pow(1 + (this.yearInterestRate / 100.0d), this.years));
    }
}
