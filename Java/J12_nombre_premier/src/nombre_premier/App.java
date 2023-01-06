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
		
		System.out.println("Entrer un nombre plus grand que 1");
		
		n = sc.nextInt();
		
		if (n>1) {
			
			System.out.println("Bravo, tu sais lire !!!");
			
		}
		
		if (n<2) {
			
			System.out.println("Apprends à lire connard et recommence !!!");
			
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
