package surface_secteur_circulaire;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES 
		
		double rayon;
		
		double angle;
		
		double aire;
		
		Scanner sc = new Scanner (System.in);
		
		// DÉBUT 
		
		System.out.println ("Calcul de la surface d'un secteur circulaire");
		
		System.out.println("Veuillez saisir le rayon en cm"); 
		
		rayon = sc.nextInt();
		
		System.out.println("Veuillez saisir l'angle en degrés");
		
		angle = sc.nextInt();
		
		System.out.println("Le rayon est de " + rayon + "cm");
		
		System.out.println("L'angle est de " + angle + "°");
		
		aire = (Math.PI*Math.pow(rayon,  2)*angle)/360;
		
		System.out.println("L'aire est de " + aire + "cm²");
		
		//FIN
	}

}
