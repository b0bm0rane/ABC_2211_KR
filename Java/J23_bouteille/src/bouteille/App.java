package bouteille;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bouteille maGirafe = new Bouteille("verre", 3, true, true);
		
		maGirafe.ouvrir();
		
		maGirafe.vider();
		
		System.out.println("j'ai la tete dans le caniveau, je vomis et retourne au bar");
	
		maGirafe.remplir();
		
		maGirafe.ouvrir();
		
		maGirafe.vider();
		
		System.out.println("retour au caniveau et c'est reparti pour un tour");
		
	}

}
