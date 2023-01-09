package tests;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// RANDOM entier
		
		int nb; 
		
		nb = (int) (Math.random()*100); //*100 entier
		
		System.out.println(nb);
		
		// RANDOM double
		
		double nbd;
		
		nbd = Math.random();
		
		System.out.println(nbd*100); //*100 (1-100)
		
	}

}
