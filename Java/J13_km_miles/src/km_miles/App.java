package km_miles;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// VARIABLES
		
		double km;
		
		double miles;
		
		String quit = "q";
		
		String saisie_utilisateur;
		
		boolean fermeture_prog = false;
		
		Scanner sc = new Scanner(System.in);
		
		// DÉBUT 
		
		while(!fermeture_prog) {
			
			System.out.println("Entrer une valeur en km entre 0.01 et 1000000 : ");
			
			saisie_utilisateur = sc.nextLine();
			
			if(saisie_utilisateur.equals(quit)) {
				
				fermeture_prog = true;
			}
			
			else { 
				
				km = Double.parseDouble(saisie_utilisateur);
				
				if(km < 0.01 && km > 1000000) {
					
					System.out.println("Entrer une valeur en km entre 0,01 et 1000000 : ");
					
					saisie_utilisateur = sc.nextLine();
				}
				
				else { 
					
					miles = km/1.609;
					
					System.out.println(km + " km équivaut à " + miles + " miles ");
				}
			}
		}
		
		sc.close();
		
		}
}