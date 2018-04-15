import java.util.Scanner;

/**
 * Калькулятор для сложения дробных чисел
 * @author Alina Vokorina
 * @see #main(String[])
 */
public class Task3part1ValidCalculator {
	
	/**
	 * Сложение дробных чисел
     * @param args Параметры Java программы
	 */
	public static void main (String[] args) {
		Scanner sc; // создали переменную sc 
		sc = new Scanner (System.in); // переменная sc указывает на сканер, который читает системный ввод пользователя
		
		System.out.println("Enter the first number:");
		double i = sc.nextDouble();
		
		System.out.println("Choose the operation:"); // вывести в консоль текст
		
		String str;
		str = sc.next();
		
		double result = 0;
		
		if (str.equals("+")) 
			{
				System.out.println("Enter the second number:");
				double j = sc.nextDouble();
				result = i+j; 
				System.out.print("result is: ");
				System.out.printf("%.4f", result);
			}
		else 
			{
				if (str.equals("-")) 
					{
						System.out.println("Enter the second number:");
						double j = sc.nextDouble();
						result = i-j; 
						System.out.print("result is: ");
						System.out.printf("%.4f", result);
					}
				else 
					{
						if (str.equals("*")) 
							{
								System.out.println("Enter the second number:");
								double j = sc.nextDouble();
								result = i*j; 
								System.out.print("result is: ");
								System.out.printf("%.4f", result);
							}
						else 
							{
								if (str.equals("/")) 
									{
										System.out.println("Enter the second number:");
										double j = sc.nextDouble();
										result = i/j; 
										System.out.print("result is: ");
										System.out.printf("%.4f", result);
									}
								else 
									{
										System.out.println("Error");
									}
							}
					}
			}
		
		sc.close ();
	}
}