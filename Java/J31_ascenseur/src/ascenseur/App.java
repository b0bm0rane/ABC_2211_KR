package ascenseur;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ascenseur monAscenseur = new Ascenseur (false, 0, 1, 1, 2, 0, 3); 
		
		// ouvert, vitesse, monEtage, ascEtage, etageCible, etageMini, etageMaxi
		
		monAscenseur.monter();
		
	}

}
