package tri_nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES 
		
		double a;
		
		
		double b; 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Comparaison de nombres");
	
		System.out.println("Veuillez saisir un nombre");
		
		a = sc.nextDouble();
		
		System.out.println("Le nombre a est " + a);
		
		b = sc.nextDouble();
		
		System.out.println("Le nombre b est " + b);
		
		System.out.println("");
		
		if (a > b) {
			System.out.println("a > b ");
			System.out.println(a + "> " + b);
		}
		
		else {
			System.out.println("a < b");
			System.out.println(a + " < " + b);
		}
		
	}

}
