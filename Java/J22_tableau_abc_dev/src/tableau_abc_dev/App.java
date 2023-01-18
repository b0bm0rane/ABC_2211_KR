package tableau_abc_dev;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choix;
		
		Scanner sc = new Scanner (System.in);
		
		String [] abcdev = 
				
				{"Florian", 
				"Frederic", 
				"Guillaume", 
				"Kevin", 
				"Mickael", 
				"Mustapha", 
				"Natana", 
				"Olivier", 
				"Raphael", 
				"Samba", 
				"Stefan", 
				"Terence"};
		
		System.out.println("Quel est votre choix ?");
		
		choix = sc.nextInt();
		
		if (choix >= 0 && choix < abcdev.length) {
		
			System.out.println(abcdev[choix]);
		
		}
			
		else {
		
			System.out.println("Error 404 not found");
		
		}

		sc.close();
		
	}

}
