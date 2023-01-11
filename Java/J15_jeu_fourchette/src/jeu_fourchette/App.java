package jeu_fourchette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		int random;
		
		int nb;
		
		int x;
		
		x = 2;
		
		random = (int) (Math.random()*101);
		
		Scanner sc = new Scanner (System.in);
		
		// DEBUT
		
		System.out.println("Jeu de la fourchette");
		
		System.out.println("Saisir une valeur entre 0 et 100");
		
		nb = sc.nextInt();
		
		if (nb == random) {
				
				System.out.println("Bravo vous avez trouvé en " + x + " essais");
						
				
				
		}
			
	}

}
