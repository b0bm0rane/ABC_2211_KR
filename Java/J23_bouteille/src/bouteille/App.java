package bouteille;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bouteille maGirafe = new Bouteille(3, 2, true); 
		System.out.println(maGirafe.toString());
		
		//capaciteEnL, contenanceEnL, ouverte
		
		maGirafe.ouvrir();
		System.out.println(maGirafe.toString());
		
		maGirafe.vider(2.0f);
		System.out.println(maGirafe.toString());
	
		maGirafe.remplir(0.5f);
		System.out.println(maGirafe.toString());
		
		maGirafe.fermer();
		System.out.println(maGirafe.toString());
		
		maGirafe.fermer();
		System.out.println(maGirafe.toString());
		
	}

}
