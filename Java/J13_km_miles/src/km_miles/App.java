package km_miles;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DÉBUT PROGRAMME 
		
		// VARIABLES
		
		double km;
		double q;
		double mil;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre entre 0.01 et 1 000 000 en km");
		
		km = sc.nextDouble();	
		
		(q>=0.01&&q<=1000000);
		
		mil=km/1.609;
		
		if (km>0.01&&km<1000000) {
	
		System.out.println("Vous avez entré " + km);
			
		}
		
		if (km=q) {

		System.out.println(km + " km est égal à " + mil + "miles");
		
		}
		
		sc.close();
		
		}
}
