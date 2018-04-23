import java.util.Scanner;

public class Choise {
	public static void main (String[] args) {
		Scanner sc;
		sc = new Scanner (System.in); 
		System.out.println("Whitch program do you want to turn on:");
		System.out.println("1-Calculator");
		System.out.println("2-Massiv");
		
		int a;
		a = sc.nextInt();
		if (a==1)
		{
		
			System.out.println("Enter the first number:");
			double i = sc.nextDouble();
			
			System.out.println("Choose the operation:");
			
			
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
			
			
		}

		if (a==2) 
		{
		
			System.out.println("Enter array size:");
			int i = sc.nextInt();
			
			String[] mas = new String[i];	
			System.out.println("Enter array element:");
			for (int position=0; position<mas.length; position++){
				String s = sc.next();
				mas[position] = s;
			} 
			
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
	
		}
		sc.close();
	}
}