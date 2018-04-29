package task2;

import java.util.Scanner;

/**
 * Задание 2
 *
 * @author Alina Vokorina
 */
public class Calculator {

    /**
     * Сложение дробных чисел
     *
     * @param args Параметры Java программы
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double i = sc.nextDouble();
        System.out.println("Enter the second number:");
        double j = sc.nextDouble();
        double sum = i + j;
        System.out.print("Sum is: ");
        System.out.printf("%.4f", sum);
        sc.close();
    }
}
