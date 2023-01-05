package année_bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		int a;
		
		Scanner sc = new Scanner (System.in);
		
		// Début
		
		System.out.println("Année bissextile");
		
		System.out.println("Entrer l'année");
		
		a = sc.nextInt();
		
		System.out.println("L'année est " + a);
		
		if (a%4!=0||a%100==0&&a%400!=0) {
		
			System.out.println("L'année n'est pas bissextile");
		
		}
		
		else {
		
			System.out.println("L'année est bissextile");
		
		}
		
		sc.close();
		
		// FIN
	}

}
