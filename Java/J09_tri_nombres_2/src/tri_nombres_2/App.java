package tri_nombres_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		
		double a;
		
		double b;
		
		double c;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Tri de nombres 2");
		
		System.out.println();
		
		System.out.println("Veuillez saisir le nombre a");
		
		a = sc.nextDouble();
		
		System.out.println("Le nombre a est " + a);
		
		System.out.println();
		
		System.out.println("Veuillez saisir le nombre b");
		
		b = sc.nextDouble();
		
		System.out.println("Le nombre b est " + b);
		
		System.out.println();
		
		System.out.println("Veuillez saisir le nombre c");
		
		c = sc.nextDouble();
		
		System.out.println("Le nombre c est " + c);
		
		System.out.println();
		
		if (a<b&&b<c) {
		
			System.out.println("a<b<c");
		
			System.out.println(a + " < " + b + " < " + c);
		}
		
		else if (a<c&&c<b) {
		
			System.out.println("a<c<b");
		
			System.out.println(a + " < " + c + " < " + b);
		}
		
		else if (b<a&&a<c) {
		
			System.out.println("b<a<c");
		
			System.out.println(b + " < " + a + " < " + c);
		}
		
		else if (b<c&&c<a) {
		
			System.out.println("b<c<a");
		
			System.out.println(b + " < " + c + " < " + a);
		}
			
		else if (c<a&&a<b) {
		
			System.out.println("c<a<b");
		
			System.out.println(c + " < " + a + " < " + b);
		}
			
		else if (c<b&&b<a) {
		
			System.out.println("c<b<a");
		
			System.out.println(c + " < " + b + " < " + a);
		}
		
		sc.close();
		
	}

}
