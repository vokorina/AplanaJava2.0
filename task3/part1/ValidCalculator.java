package task3.part1;

import java.util.Scanner;

/**
 * Задание 3.1
 *
 * @author Alina Vokorina
 */
public class ValidCalculator {

    /**
     * Сложение дробных чисел
     *
     * @param args Параметры Java программы
     */
    public static void main(String[] args) {
        Scanner sc; // создали переменную sc
        sc = new Scanner(System.in); // переменная sc указывает на сканер, который читает системный ввод пользователя

        System.out.println("Enter the first number:");
        double i = sc.nextDouble();

        System.out.println("Choose the operation:"); // вывести в консоль текст

        String str;
        str = sc.next();

        System.out.println("Enter the second number:");
        double j = sc.nextDouble();

        double result = 0;

        if (str.equals("+")) {
            result = i + j;
        } else {
            if (str.equals("-")) {
                result = i - j;
            } else {
                if (str.equals("*")) {
                    result = i * j;
                } else {
                    if (str.equals("/")) {
                        result = i / j;
                    } else {
                        System.out.println("Error");
                    }
                }
            }
        }
        System.out.print("result is: ");
        System.out.printf("%.4f", result);

        sc.close();
    }
}
