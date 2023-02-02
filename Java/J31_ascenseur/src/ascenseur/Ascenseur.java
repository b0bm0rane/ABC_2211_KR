package ascenseur;

public class Ascenseur {

	private boolean ouvert;
	
	private boolean statique;
	
	private int monEtage;
	
	private int ascEtage;
	
	private int etageMini;
	
	private int etageMaxi;
	
	public Ascenseur (boolean ouvert, boolean statique, int monEtage, int ascEtage, int etageMini, int etageMaxi) {
		
		this.ouvert = ouvert;
		
		this.statique = statique;
		
		this.ascEtage = ascEtage;
		
		this.monEtage = monEtage;
		
		this.etageMini = etageMini;
		
		this.etageMaxi = etageMaxi;
		
	}
	
	// TODO KR appeler monter descendre
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean ouvrir() {
		
		if (this.statique) {
			
			System.out.println("j'ouvre la porte de l'ascenseur");
		
			return true;
				
		}
		
		else {
			
			System.out.println("l'ascenseur est en mouvement");				
		
			return false;
			
		}
		
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean fermer() {
		
		if (this.statique) {
			
			System.out.println("je ferme la porte de l'ascenseur");
			
			return true;
			
		}
		
		else {
			
			System.out.println("l'ascenseur est en mouvement");
			
			return false;
		
		}
		
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
}
