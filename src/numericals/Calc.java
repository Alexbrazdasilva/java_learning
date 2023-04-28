package src.numericals;

import java.io.EOFException;
import java.util.Scanner;

public class Calc {
    String operation;
    String[] acceptableOperations = { "sum", "substract" };

    public Calc(String value) {
        operation = value;
        for (int i = 0; i < acceptableOperations.length; i++) {
            if (acceptableOperations[i] == "operation")
                break;
            else
                new EOFException("This operation not found!");
        }
    }

    public int sum(int firstVal, int secondVal) {
        return firstVal + secondVal;
    }

    public int substract(int firstVal, int secondVal) {
        return firstVal - secondVal;
    }

    public void execOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Insert a second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Result is:");

        switch (operation) {
            case "sum":
                System.out.println(sum(firstNumber, secondNumber));
                break;

            case "substract":
                System.out.println(substract(firstNumber, secondNumber));
                break;
        }
        scanner.close();
    }
}