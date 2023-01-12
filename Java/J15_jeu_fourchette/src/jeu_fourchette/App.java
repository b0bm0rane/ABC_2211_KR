package jeu_fourchette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		int random; // nb genere par l'ordinateur (Réponse)
		
		int nb; // nb donne par l'utilisateur (Question)
		
		int min = 0;
		
		int max = 100;
		
		int x = 0; // nb essais
		
		random = (int) (Math.random()*101); // 0 à 100
		
		Scanner sc = new Scanner (System.in);
		
		// DEBUT
			
		System.out.println("Jeu de la fourchette");
		
		do {
		
			System.out.println("Entrer un nombre entre " + min + " et " + max);
		
			nb = sc.nextInt(); 
		
			x++;
			
			if (nb < min  || nb > max) { 
			
				System.out.println("Tu sais lire connard ???");
				
			}
			
			else if (nb < random) {
				
				min = nb; 
				
				System.out.println("Elle est trop petite mon gars...");
				
			}
			
			else if (nb > random) {
				
				max = nb; 
				
				System.out.println("Elle est pas aussi grande...");
				
			}
			
		} while (random != nb);
		
		System.out.println("Trouvé en " + x + " essais, bien joué ma couille");
		
	}

}
