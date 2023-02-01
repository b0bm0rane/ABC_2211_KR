package bouteille;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bouteille maGirafe = new Bouteille(3, 2, false, false); 
		
		//capaciteEnL, contenanceEnL, ouverte, remplie
		
		maGirafe.ouvrir();
		
		maGirafe.vider();
	
		maGirafe.remplir();
		
	}

}
