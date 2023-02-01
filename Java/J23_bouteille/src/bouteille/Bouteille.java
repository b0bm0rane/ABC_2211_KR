package bouteille;

public class Bouteille {

	// états / attributs
	
	// état inaccessible de l'exterieur de la classe
	
	private final float capaciteEnL;
	
	private float contenanceEnL;
	
	private Boolean ouverte;
	
	private Boolean remplie;
	
	// constructeur (méthodes) 
	
	public Bouteille(float cap, float cont, Boolean ouv, Boolean remp) {
		
		
		
		// this : cet objet
		
		this.capaciteEnL = cap;
		
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
	
	public Boolean remplir(float quantiteAjoutee) {
		
		if (this.ouverte) {
			
			float nouvelleContenanceEnL = this.contenanceEnL + quantiteAjoutee;
					
			if (nouvelleContenanceEnL > this.capaciteEnL) {
					
				this.contenanceEnL = this.capaciteEnL;
						
				System.out.println("ma bouteille est remplie");
				
				return false; 
						
			} else {
				
				this.contenanceEnL = nouvelleContenanceEnL;
					
				System.out.println("ma bouteille a ete remplie de " + quantiteAjoutee);
				
				return true;
				
			}
				
		} else {
			
			System.out.println("ma bouteille est fermee");
			
			return false;
			
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
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
public Boolean vider(float quantiteRetiree) {
		
		if (this.ouverte) {
			
			float nouvelleContenanceEnL = this.contenanceEnL - quantiteRetiree;
			
			if (nouvelleContenanceEnL < this.capaciteEnL) {
				
				this.contenanceEnL = this.capaciteEnL;
				
				System.out.println("ma bouteille est videe");
				
				return false;
				
			} else {
				
				this.contenanceEnL = nouvelleContenanceEnL;
				
				System.out.println("ma bouteille a ete videe de " + quantiteRetiree);
				
				return true;
				
			}
			
		} else {
			
			System.out.println("ma bouteille est fermee");
			
			return false;
			
		}
	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
}
