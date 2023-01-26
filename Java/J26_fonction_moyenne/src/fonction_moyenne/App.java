package fonction_moyenne;

import java.util.Scanner;

public class App {

	public static double moyenne(double a, double b) {
		
		return (a + b) / 2;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("saisir a");
		
		double a = sc.nextDouble();
		
		System.out.println("saisir b");
		
		double b = sc.nextDouble();
		
		System.out.println("la moyenne de " + a + " et " + b + " est " + moyenne(a, b));
		
	}

}
