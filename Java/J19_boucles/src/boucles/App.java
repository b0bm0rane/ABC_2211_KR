package boucles;

public class App {

	/**
	 * afficher tous les nombres de 1 à 100
	 * en remplçant les multiples de 7 par "bzz"
	 * et les multiples de 5 par "biz"
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int indice = 1;
		
		while(indice <= 100) {
			
			if(indice % 7 == 0) {
				
				System.out.println("bzz");
			}
			
			else if(indice % 5 == 0) {
				
				System.out.println("biz");
				
			}
			
			else {
				
				System.out.println(indice);
				
			}

			indice++;

		}
		
	}

}
