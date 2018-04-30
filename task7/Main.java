package task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operand leftOperand, rightOperand;
        Operation operation;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            leftOperand = new Operand(scanner.nextDouble());

            System.out.println("Choose the operation:");
            operation = Operation.getBySymbol(scanner.next().charAt(0));

            System.out.println("Enter the second number:");
            rightOperand = new Operand(scanner.nextDouble());

            Calculator calc = new Calculator(leftOperand, rightOperand, operation);

            System.out.println("Результат вычислений: " + calc.getResult());
        } catch (RuntimeException e) {
            System.out.println("Во время работы калькулятора произошла ошибка. " + e.getLocalizedMessage());
        }
    }
}
