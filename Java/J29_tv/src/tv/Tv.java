package tv;

public class Tv {

	// états / attributs
	
	private String matiere;
	
	private boolean deuxPieds;
	
	private String couleur;
	
	private String marque;
	
	private int poidsEnKg;
	
	private int prixEnEuros;
	
	// constructeur (méthodes)
	
	public boolean allumee;
	
	public Tv(String mat, int prix, boolean pieds, String coul, String mar, int kg, boolean all) {	
		
		// this : cet objet
		
		this.matiere= mat;
		
		this.prixEnEuros = prix;
		
		this.deuxPieds = pieds;
		
		this.couleur = coul;
		
		this.marque = mar;
		
		this.poidsEnKg = kg;
		
		this.allumee = all;
		
		// méthodes (opérations comportements)
		
		String deuxpieds;
		
		if (this.deuxPieds) {
		
			deuxpieds = "deux pieds";
		
		} 
		
		else {
			
			deuxpieds = "un pied";
			
		}
		
		String allumee;
		
		if (this.allumee) {
			
			allumee = "allumee";
			
		}
		
		else {
			
			allumee = "eteinte";
			
		}
		
		System.out.println
		("Bonjour, je suis une tv en " + matiere + 
		" qui vaut " + this.prixEnEuros + " euros, " +
		"possede " + deuxpieds + 
		", de couleur " + this.couleur + 
		", de marque " + this.marque + 
		", qui pese " + this.poidsEnKg + " kg " +
		" et qui est " + allumee);
	}
	
	public Boolean allumer() {
		
		if (this.allumee == true) {
		
			System.out.println("ma tele est deja allumee");
			
			return false;
		
		}
		
		else {
		
			this.allumee = true;
			
			System.out.println("j'ai allume ma tele");
			
			return true;
		
		}
		
	}
	
	//TODO KER finir le code d'eteindre
	public void eteindre() {
		
		this.allumee = false;
		
		System.out.println("j'ai eteinds ma tele");
	}
	
}
