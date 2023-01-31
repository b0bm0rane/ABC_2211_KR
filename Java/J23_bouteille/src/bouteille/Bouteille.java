package bouteille;

public class Bouteille {

	// états / attributs
	
	private String matiere; // état inaccessible de l'exterieur de la classe
	
	private float volumeEnL;
	
	private Boolean gazeux;
	
	private Boolean ouverte;
	
	private Boolean alcool;
	
	private Boolean remplie;
	
	// constructeur (méthodes) 
	
	public Bouteille(String mat, float vol, Boolean gaz, Boolean alc) {
		
		
		
		// this : cet objet
		
		this.matiere = mat;
		
		this.volumeEnL = vol;

		this.gazeux = gaz;
		
		this.ouverte = false; // sinon plus de bulles xD
		
		this.alcool = alc;
		
		this.remplie = true;
		
	}
	
	// méthodes (opérations comportements)
	
	public void ouvrir() {
		
		this.ouverte = true;
		
		System.out.println("j'ai ouvert ma bouteille");
		
	}
	
	public void fermer() {
		
		this.ouverte = false;
		
		System.out.println("ma bouteille est fermee");
		
	}
	
	public void vider() {
		
		this.remplie = false;
		
		System.out.println("la bouteille est vide");
		
	}
	
	public void remplir() {
		
		this.remplie = true;
		
		System.out.println("la bouteille est remplie");
	}
	
	public boolean ouverte() {
		
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
	
}

