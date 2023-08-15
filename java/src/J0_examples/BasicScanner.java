package J0_examples;

import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = input.nextLine();
        System.out.printf("Your name: " + name);
    }
}
