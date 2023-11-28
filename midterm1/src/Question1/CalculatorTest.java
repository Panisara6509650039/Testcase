package Question1;

import java.util.Scanner;

public class CalculatorTest {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		Calculator cal =  new Calculator();
		System.out.print("Enter weight : ");
		double weight = scanner.nextDouble();
		
		System.out.printf(" %.2f kilogram => %.3f pound",weight ,cal.kilopound(weight));
		double temp1 = 98.6 ;
		double temp2 = 32;
		System.out.printf("\n %.2f\u00b0F \u2192 , %.2f\u00b0C",temp1,cal.convertFarenheitToCelsius(temp1));
		System.out.printf("\n %.2f\u00b0F \u2192 , %.2f\u00b0C",temp2,cal.convertFarenheitToCelsius(temp2));
		scanner.close();
		
	}
}
