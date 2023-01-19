package evaluation;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		
		int mois;
		int choix;
		int jours;
		
		Scanner sc = new Scanner (System.in);
		
		// Tableau des mois
		
		String [] name = {  
				"",
				"janvier", 
				"fevrier", 
				"mars", 
				"avril", 
				"mai", 
				"juin", 
				"juillet", 
				"aout", 
				"septembre", 
				"octobre", 
				"novembre", 
				"decembre"};
		
		// Début
		
		System.out.println("Saisissez un numéro de mois");
		
		mois = sc.nextInt();
		
		choix = mois;
		
		while (mois < 1 && mois > 12) {
			
			System.out.println("Numéro de mois invalide, veuillez recommencer");
		
			mois = sc.nextInt();
		
		}
		
		if (mois % 2 == 0) {
			
			System.out.println("Le mois de " + (name[choix]) + mois + " est pair");
		
			System.out.println("Les jours impairs du mois sont : ");
			
			for (jours = 1 ; jours <= 31; jours ++) {
				
				if (jours % 2 != 0 && jours % 3 !=0)
				
					System.out.println(jours);
			
			}
		
		}
			
		else if (mois % 2 != 0) {
			
			System.out.println("Le mois de " + (name[choix]) + mois + " est impair");
			
			System.out.println("Les jours pairs du mois sont : ");
			
			for (jours = 2 ; jours <= 31; jours ++) {
				
				if (jours % 2 == 0 && jours % 10 !=0) {
					
					System.out.println(jours);
				
					}
			
				}
			
			}
	
		}
		
	}

		// Fin