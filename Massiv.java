import java.util.Scanner;

/**
 * Массив
 * @author Alina Vokorina
 * @see #main(String[])
 */
public class Massiv {
	public static void main (String[] args) {
		//TODO 2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
		Scanner sc; // создали переменную sc 
		sc = new Scanner (System.in); // переменная sc указывает на сканер, который читает системный ввод пользователя
		
		System.out.println("Enter array size:");
		int i = sc.nextInt();
		
		String[] mas = new String[i];	
		System.out.println("Enter array element:");
		for (int position=0; position<mas.length; position++){
			String s = sc.next();
			mas[position] = s;
			//sc, i, mas, position, s 
		}
		//  sc, i, mas 
		
		int size = -1;
		int pos = -1;
		for (int position2=0; position2<mas.length; position2++) {
			String element = mas[position2];
			if (size<element.length()) {
				size = element.length();
				pos = position2;	
			}
		}
		System.out.println("Max element in array is : " + mas[pos]);
	
		// size, sc, i, mas, pos 
	}
}