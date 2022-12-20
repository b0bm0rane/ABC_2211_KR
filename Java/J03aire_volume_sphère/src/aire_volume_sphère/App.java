package aire_volume_sphère;

import java.util.Scanner; 
/*
VARIABES
R est un entier
Aire est un réel double
Volume est un réel double
DÉBUT PROGRAMME
Écrire "Veuillez écrire la valeur du rayon R"
Lire R
Aire = 4 pi R^2
Volume = 4/3 pi R^3
Écrire "L'aire de la sphère est de " +Aire
Écrire "Le volume de la sphère est de " +Volume
 */

public class App {

	public static void main(String[] args) {
		
		// VARIABLES

		// Utilisation de l'objet pi de la classe Java 
		double pi = Math.PI;
		int rayon;
		// Utilisation de l'objet pow(puissance) de la classe math (1er paramètre la variable le nombre, 2ème paramètre la puissance)
		double aire;
		
		double volume;
		
		// DÉBUT
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("PROGRAMME DE CALCUL DE L'AIRE ET DU VOLUME D'UNE SPHERE");
		
		System.out.println("Veuillez saisir le rayon");
		
		rayon = sc.nextInt();
		
		aire = 4*pi*Math.pow(rayon,  2);
				
		volume = 4/3*pi*Math.pow(rayon,  3);
		
		System.out.println("Le rayon de la sphère est de: " + rayon + "cm");
		
		System.out.println("L'aire de la sphère est de: " + aire + "cm^2");
		
		System.out.println ("Le volume de la sphère est de: " + volume + "cm^3");
		
	}

}
