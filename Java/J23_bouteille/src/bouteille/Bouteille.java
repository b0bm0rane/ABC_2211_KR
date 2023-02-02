package bouteille;

public class Bouteille {

	// états / attributs
	
	// état inaccessible de l'exterieur de la classe
	
	private final float capaciteEnL;
	
	private float contenanceEnL;
	
	private boolean ouverte;
	
	private boolean estRemplie() {
	
	return capaciteEnL == contenanceEnL;
	
	}
	
	// constructeur (méthodes) 
	
	public Bouteille(float capaciteEnL, float contenanceEnL, boolean ouverte) {
		
		// this : cet objet
		
		this.capaciteEnL = capaciteEnL;
		
		this.contenanceEnL = contenanceEnL;
		
		this.ouverte = ouverte;
		
		this.estRemplie();
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// méthodes (opérations comportements)
	
	public boolean ouvrir() {
		
		if (this.ouverte) {
			
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
	
	public boolean fermer() {
		
		if (!this.ouverte) {
			
			System.out.println("ma bouteille est deja fermee");
			
			return false;
			
		}
		
		else {
			
			this.ouverte = false;
		
			System.out.println("je ferme ma bouteille");
		
			return true;
		
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean remplir() {
		
		if (this.ouverte) {
		
			if (this.estRemplie()) {
			
				System.out.println("ma bouteille est deja remplie");
			
				return false;
			
			}
			
			else {
				
				this.contenanceEnL = this.capaciteEnL;
				
				System.out.println("je remplis entierement ma bouteille");
				
				return true;
				
			}
			
		}
		
		else {
			
			System.out.println("ma bouteille est fermee");
			
			return false;
			
		}
			
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean remplir(float quantiteAjoutee) {
		
		if (this.ouverte) {
			
			float nouvelleContenanceEnL = this.contenanceEnL + quantiteAjoutee;
					
			if (nouvelleContenanceEnL > this.capaciteEnL) {
					
				//this.contenanceEnL = this.capaciteEnL;
						
				System.out.println("ma bouteille va deborder, donc je ne la remplis pas");
				
				return false; 
						
			}

			else {
				
				this.contenanceEnL = nouvelleContenanceEnL;
					
				System.out.println("ma bouteille a ete remplie de " + quantiteAjoutee +
						
						", elle contient mainteant " + this.contenanceEnL);
				
				return true;
				
			}
				
		}

		else {
			
			System.out.println("ma bouteille est fermee");
			
			return false;
			
		}
	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
		
	public boolean vider() {
			
		if (this.contenanceEnL > 0) {
		
			this.contenanceEnL = 0;
			
			System.out.println("je vide entierement ma bouteille");
			
			return true;
		
		}
		
		else {
			
			System.out.println("ma bouteille est deja vide");
			
			return false;
	
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean vider(float quantiteRetiree) {
		
		if (this.ouverte) {
			
			float nouvelleContenanceEnL = this.contenanceEnL - quantiteRetiree;
			
			if (nouvelleContenanceEnL < this.capaciteEnL) {
				
				this.contenanceEnL = 0;
				
				System.out.println("ma bouteille est videe");
				
				return false;
				
			} else {
				
				this.contenanceEnL = nouvelleContenanceEnL;
				
				System.out.println("ma bouteille a ete videe de " + quantiteRetiree + 
						
						" elle contient maintenant " + this.contenanceEnL);
				
				return true;
				
			}
			
		} else {
			
			System.out.println("ma bouteille est fermee");
			
			return false;
			
		}
	
	}
	
	public String toString() {
		
		return "capaciteEnL = " + this.capaciteEnL + 
				" ; contenanceEnL = " + this.contenanceEnL +
				" ; ouverte = " + this.ouverte;
				
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
}
