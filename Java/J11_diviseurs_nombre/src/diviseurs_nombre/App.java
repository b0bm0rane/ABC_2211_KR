package diviseurs_nombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		int n;
		
		Scanner sc = new Scanner (System.in);
		
		// DÉBUT
		
		System.out.println("Diviseurs d'un nombre");
		
		System.out.println("Entrer un nombre entier");
		
		n = sc.nextInt();
		
		for (int i=2;i<n;i++) {
		
			if (n%i==0) {
		
				System.out.println(i);
			}
		
		}
	}

}