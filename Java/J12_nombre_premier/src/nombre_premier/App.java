package nombre_premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DÉBUT
		
		// VARIABLES
		
		int n;
		int i;
		int nd;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer un nombre");
		
		n = sc.nextInt();
		
		for (i=2;i<n-1;i++) {
		
		if (n%i==0) {
			System.out.println(n + " n'est pas un nombre premier");
		}
		else {
		
			System.out.println(n + " est un nombre premier");
		
		}
		
		}
		
	}

}
