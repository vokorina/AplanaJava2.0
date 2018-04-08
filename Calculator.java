import java.util.Scanner;

/**
 * Калькулятор для сложения дробных чисел
 * @author Alina Vokorina
 * @see #main(String[])
 */
public class Calculator {
	
	/**
	 * Сложение дробных чисел
     * @param args Параметры Java программы
	 */
	public static void main (String[] args) {
		Scanner sc;
		sc = new Scanner (System.in);
		System.out.println("Enter the first number:");
		double i = sc.nextDouble();
		System.out.println("Enter the second number:");
		double j = sc.nextDouble();
		double sum = i+j;
		System.out.print("Sum is: ");
		System.out.printf("%.4f", sum);
		/* String t = sc.next();
		System.out.println("Integer: "+ i);
		System.out.println("String: "+ t);*/
		//System.err.println("This is error stream");
		sc.close ();
	}
}