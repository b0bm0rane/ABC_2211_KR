package bouteille;

public class Bouteille {

	// états / attributs
	
	private String matiere; // état inaccessible de l'exterieur de la classe
	
	private String boisson;
	
	private float volumeEnL;
	
	private float contenanceEnL;
	
	private Boolean ouverte;
	
	private Boolean remplie;
	
	// constructeur (méthodes) 
	
	public Bouteille(String mat, String boi, float vol, float cont, Boolean ouv, Boolean remp) {
		
		
		
		// this : cet objet
		
		this.matiere = mat;
		
		this.boisson = boi;
		
		this.volumeEnL = vol;
		
		this.contenanceEnL = cont;
		
		this.ouverte = ouv;
		
		this.remplie = remp;
		
	}
	
	// méthodes (opérations comportements)
	
	public Boolean ouvrir() {
		
		if (this.ouverte == true) {
			
			System.out.println("ma bouteille est deja ouverte");
			
			return false;
			
		}
		
		else {
			
			this.ouverte = true;
			
			System.out.println("j'ouvre ma bouteille");
			
			return true;
			
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Boolean fermer() {
		
		if (this.ouverte == true) {
			
			System.out.println("je ferme ma bouteille");
			
			return false;
		}
		
		
		else {
			
			this.ouverte = false;
		
				System.out.println("ma bouteille est fermee");
		
		return true;
		
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Boolean remplir() {
		
		if (this.remplie == true) {
		
		System.out.println("ma bouteille est remplie");
		
		return false;
		
		}
		
		else {
			
			this.remplie = false;
			
			System.out.println("je rempli ma bouteille");
			
			return true;
			
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
		
	public Boolean vider() {
			
		if (this.remplie == false) {
			
		System.out.println("je vide ma bouteille");
			
		return true;
		
		}
		
		else {
			
			this.remplie = true;
			
			System.out.println("ma bouteille est vide");
			
			return false;
	
		}
		
	}
	
}

