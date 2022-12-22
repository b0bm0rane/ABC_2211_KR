package comparaison_nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		int a;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Comparaison de nombres");
		
		System.out.println("Veuillez saisir le nombre d'années");
		
		a = sc.nextInt();
		
		if (a <= 0)
		{
			System.out.println("Vous n'êtes pas né");
		}
		else if (a >= 18)
		{
			System.out.println("Vous êtes majeur"); 
		}
		else
		{
		System.out.println("Vous êtes mineur");
		}
		// FIN
	}

}
