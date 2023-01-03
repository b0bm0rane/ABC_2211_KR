package tri_nombres_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		double a;
		
		double b;
		
		double c;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Tri de nombres 2");
		
		System.out.println("Veuillez saisir le nombre a");
		
		a = sc.nextDouble();
		
		System.out.println("Le nombre a est " + a);
		
		System.out.println("Veuillez saisir le nombre b");
		
		b = sc.nextDouble();
		
		System.out.println("Le nombre b est " + b);
		
		System.out.println("Veuillez saisir le nombre c");
		
		c = sc.nextDouble();
		
		System.out.println("Le nombre c est " + c);
		
		if (a<b&b<c);
		
		System.out.println(a + " < " + b + " < " + c);
	}

}
