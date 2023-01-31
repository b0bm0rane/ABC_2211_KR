package bouteille;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bouteille maGirafe = new Bouteille("verre", "eau", 3, 2, true, false); 
		
		//matiere, boisson, volumeEnL, contenanceEnL, ouverte, remplie
		
		maGirafe.ouvrir();
		
		maGirafe.vider();
	
		maGirafe.remplir();
		
	}

}
