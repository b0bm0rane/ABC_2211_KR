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
	
	public Bouteille(float capaciteEnL, float contenanceEnL, boolean ouverte, boolean estRemplie) {
		
		// this : cet objet
		
		this.capaciteEnL = capaciteEnL;
		
		this.contenanceEnL = contenanceEnL;
		
		this.ouverte = ouverte;
		
		this.estRemplie();
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// méthodes (opérations comportements)
	
	public Boolean ouvrir() {
		
		if (this.ouverte == true) {
			
			System.out.println("ma bouteille est deja ouverte");
			
			return false;
			
		}
		
		else {
			
			this.ouverte = false;
			
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
		
				System.out.println("ma bouteille est deja fermee");
		
		return true;
		
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Boolean remplir() {
		
		if (this.estRemplie() == true) {
		
		System.out.println("ma bouteille est deja remplie");
		
		return false;
		
		}
		
		else {
			
			this.estRemplie() = false;
			
			//TODO KER modifier la contenance
			
			System.out.println("je rempli ma bouteille");
			
			return true;
			
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Boolean remplir(float quantiteAjoutee) {
		
		if (this.ouverte) {
			
			float nouvelleContenanceEnL = this.contenanceEnL + quantiteAjoutee;
					
			if (nouvelleContenanceEnL > this.capaciteEnL) {
					
				//this.contenanceEnL = this.capaciteEnL;
						
				System.out.println("ma bouteille va deborder, donc je ne la remplie pas");
				
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
		
	public Boolean vider() { //TODO KER
			
		if (this.estRemplie() == false) {//TODO KER
			
		System.out.println("je vide ma bouteille");
		
		//il faut changer la contenance
			
		return true;
		
		}
		
		else {
			
			//this.remplie = true;
			
			//il faut mettre la contenance a zero
			
			System.out.println("ma bouteille est vide");
			
			return true;
	
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
