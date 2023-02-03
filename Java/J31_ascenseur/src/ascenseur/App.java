package ascenseur;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ascenseur monAscenseur = new Ascenseur (false, 0, 0, 2, -1, 3); 
		
		// ouvert, vitesse, monEtage, ascEtage, etageMini, etageMaxi
		
		monAscenseur.descendre();
		
	}

}
