package annee_bi;

import java.util.Scanner;

public class App {

	public static boolean anneeBi (int a) {
		
		if (a%4!=0||a%100==0&&a%400!=0) {
			
			System.out.println("L'année n'est pas bissextile");
		
			return false;
					
		}
		
		else {
		
			System.out.println("L'année est bissextile");
		
			return true;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n1;
		
		System.out.print("saisir l'année");
		
		n1 = sc.nextInt();

		System.out.println(anneeBi(n1));
		
	}

}
