package nombre_premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DÉBUT
		
		// VARIABLES
		
		int n;
		int i;
		int nd=0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer un nombre");
		
		n = sc.nextInt();
		
		if (n<2) {
			
			System.out.println("Fais pas chier connard !!!");
			
		}
		
		else {
		
			for (i=2;i<n;i++) {
			
				if (n%i==0) {
					nd++;
				}
			
			}
			
			if (nd==0) {
				
				System.out.println("Le nombre est premier");
			
			}
			
			else {
				
				System.out.println("Le nombre est composé");
			
			}
		
		}
		
		sc.close();
		
	}

}
