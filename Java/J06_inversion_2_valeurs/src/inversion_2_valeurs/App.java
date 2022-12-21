package inversion_2_valeurs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		double a;
		
		double b;
		
		double TMP;
		
		Scanner sc = new Scanner (System.in);
		
		// DÉBUT
		
		System.out.println("Inversion de 2 nombres");
		
		System.out.println("Veuillez saisir le nombre a");
		
		a = sc.nextDouble();
		
		System.out.println("Veuillez saisir le nombre b");
		
		b = sc.nextDouble();
		
		System.out.println("Le nombre a est " + a + " et le nombre b est " + b);
		
		TMP = b;
				
		b = a;
		
		a = TMP;
		
		System.out.println("");
		
		System.out.println("Inversons a et b :");
		
		System.out.println("Le nombre a est " + a + " et le nombre b est " + b);
		
		// FIN
		
	}

}
