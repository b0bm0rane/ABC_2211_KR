package nombre_premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DÉBUT
		
		// VARIABLES
		
		int n;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer un nombre");
		
		n = sc.nextInt();
		
		if (n%1==0&&n%n==0) {
			
		System.out.println(n + " est un nombre premier");
		
		}
		
	}

}
