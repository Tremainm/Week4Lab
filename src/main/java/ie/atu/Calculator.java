package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        multiply();
    }

    public static void multiply()
    {
        System.out.println("Please enter first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter second number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
    }
}
