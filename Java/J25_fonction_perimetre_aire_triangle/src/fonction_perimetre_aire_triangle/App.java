package fonction_perimetre_aire_triangle;

import java.util.Scanner;

public class App {

	public static double perimetre(double A, double B, double C) {
		
		return A + B + C;
		
	}
	
	public static double aire(double a, double b, double c) {
		
		double p = perimetre(a, b, c);
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.print("Valeur de n1 :");
		n1 = sc.nextDouble();
		
		System.out.print("Valeur de n2 :");
		n2 = sc.nextDouble();
		
		System.out.print("Valeur de n3 :");
		n3 = sc.nextDouble();
		
		double perimetreDesN = perimetre(n1, n2, n3);
		double aireDesN = aire(n1, n2, n3);
		
		System.out.println("Le perimetre est " + perimetreDesN + " et l'aire est " + aireDesN);

	}

}
