package calcul_d_intérêts;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		double s; // somme
		
		double i; // intérêts
		
		double a; // années
		
		double is; // intérêts simples

		double ic; // intérêts composés
		
		Scanner sc = new Scanner (System.in);
		
		// DÉBUT
		
		System.out.println("Calcul d'intérêts");
		
		System.out.println("Veuillez saisir la somme placée sur le compte");
		
		s = sc.nextDouble();
		
		System.out.println("La somme placée sur le compte est de: " + s + "€");
		
		System.out.println("Veuillez saisir l'intérêt offert par la banque");
		
		i = sc.nextDouble();
		
		System.out.println("L'intérêt offert par la banque est de: " + i + "%");
		
		System.out.println("Veuillez saisir le nombre d'années de placement");
		
		a = sc.nextDouble();
		
		System.out.println("Le nombre d'années de placement est de: " + a + "ans");
		
		is = s*(1+a*i/100);
		ic = s*Math.pow((1+i/100), a);
		
		System.out.println("La valeur acquise avec l'intérêts simple est de: " + is + "€");
		
		System.out.println("La valeur acquise avec l'intérêts composé est de: " + ic + "€");
		
		//FIN
		
	}

}
