package fonction_inversion;

import java.util.Scanner;

public class App {

	public static void inversion (int a, int b) {
		
		int tmp;
		
		tmp = a;
		
		a = b;
		
		b = tmp;
		
		System.out.println("apres inversion : nombre 1 = " + a + " et nombre 2 = " + b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre1;
		
		int nombre2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("saisir le nombre1");
		
		nombre1 = sc.nextInt();
		
		System.out.println("saisir le nombre2");
		
		nombre2 = sc.nextInt();
		
		System.out.println("avant l'inversion nombre1 = " + nombre1 + " nombre 2 = " + nombre2);
		
		inversion(nombre1, nombre2);
		
	}

}
