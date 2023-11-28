package Question3;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in); 
	        Triangle t1 = new Triangle(); 
	 
	        System.out.print("Enter side a: "); 
	        int a = scanner.nextInt(); 
	        t1.setA(a); 
	 
	        System.out.print("Enter side b: "); 
	        int b = scanner.nextInt(); 
	        t1.setB(b); 
	 
	        System.out.print("Enter side c: "); 
	        int c = scanner.nextInt(); 
	        t1.setC(c); 
	 
	        System.out.printf("Area of Triangle with sides (%.2f, %.2f, %.2f) = %.2f\n", t1.getA(), t1.getB(), t1.getC(), 
	                t1.calculateArea()); 
	        System.out.printf("Is it a right triangle or not? =  " + t1.isTheRightTriangle()); 
	        scanner.close();
	}
}
