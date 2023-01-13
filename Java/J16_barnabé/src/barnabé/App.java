package barnabé;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		int s; // SOMME
		
		int mag = 0; // NB MAGASINS
		
		Scanner sc = new Scanner (System.in);
		
		// DEBUT
		
		System.out.println("Barnabe est sous tutelle mais fait ses courses...");
		
		System.out.println("Entrer la somme d'argent que possede Barnabe");
		
		s = sc.nextInt();
		
		System.out.println("Barnabe possede " + s + " euros");
		
		do {
			
			mag++;
			
			if (s > 1) {
				
				s = s - (s / 2 + 1);
				
			}
			
		}		while (s>1);
		
		System.out.println("Barnabe a tout claque chez ABC_Meth et dans " + mag + " magasins. Mais ou est le tuteur ??? Ah, avec lui...");
		
		
		sc.close();
	}

}
