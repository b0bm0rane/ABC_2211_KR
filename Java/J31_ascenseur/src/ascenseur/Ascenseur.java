package ascenseur;

public class Ascenseur {

	private boolean ouvert;
	
	private int vitesse; //-1, 0, 1
	
	private int monEtage;
	
	private int ascEtage;// etage ascenseur
	
	private int etageCible;
	
	private final int etageMini; //final = constante
	
	private final int etageMaxi; //final = constante
	
	public Ascenseur(boolean ouvert, 
					
					int vitesse, 
					
					int monEtage, 
					
					int ascEtage, 
					
					int etageCible, 
					
					int etageMini, 
					
					int etageMaxi) 
	
	{
		
		this.ouvert = ouvert;
		
		this.vitesse = vitesse;
		
		this.monEtage = monEtage;
		
		this.ascEtage = ascEtage;
		
		this.etageCible = etageCible;
		
		this.etageMini = etageMini;
		
		this.etageMaxi = etageMaxi;
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean ouvrir() {
		
		if (this.monEtage == this.ascEtage) {
		
			if (this.vitesse == 0) {
				
				if (this.ouvert == false) {
				
				System.out.println("j'ouvre la porte de l'ascenseur");
			
				this.ouvert = true;
				
				return true;
				
				}
				
				else {
					
				System.out.println("la porte de l'ascenseur est deja ouverte");
				
				return false;
					
				}
					
			}	
			
			else {
				
				System.out.println("l'ascenseur est en mouvement");				
			
				return false;
				
			}
			
		}
			
		else {
			
			
		System.out.println("l'ascenseur n'est pas a mon etage");
		
		return false;
		
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 	
	public boolean fermer() {
		
		if (this.monEtage == this.ascEtage) {
		
			if (this.vitesse == 0) {
				
				if (this.ouvert == true) {
				
				System.out.println("je ferme la porte de l'ascenseur");
			
				this.ouvert = false;
				
				return true;
				
				}
				
				else {
					
				System.out.println("la porte de l'ascenseur est deja fermee");
				
				return false;
					
				}
					
			}	
			
			else {
				
				System.out.println("l'ascenseur est en mouvement");				
			
				return false;
				
			}
			
		}
			
		else {
			
			
		System.out.println("l'ascenseur n'est pas a mon etage");
		
		return false;
		
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean monter() {
		
		if (this.monEtage == this.ascEtage) {
		
			if (!this.ouvert) {
			
				if (this.monEtage < this.etageCible) {
				
					System.out.println("j'appuie sur le bouton, l'ascenseur monte");
					
					this.vitesse = 1;
					
					return true;
				
				}
				
				else {
					
					return false;
					
				}
			
			}
				
			else if (this.monEtage == this.etageCible) {
					
				System.out.println("je suis au bon etage");
				
				return false;
				
			}
				
			else {
					
				System.out.println("l'ascenseur est ouvert");
				
				return false;
			
			}
		
		}
				
		else {
			
			System.out.println("je ne suis pas dans l'ascenseur");
			
			return false;
			
		}
			
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean descendre() {
		
		if (this.monEtage == this.ascEtage) {
		
			if (!this.ouvert) {
			
				if (this.monEtage > this.etageCible) {
				
					System.out.println("j'appuie sur le bouton, l'ascenseur descends");
					
					this.vitesse = -1;
					
					return true;
				
				}
				
				else {
					
					return false;
					
				}
			
			}
				
			else if (this.monEtage == this.etageCible) {
					
				System.out.println("je suis au bon etage");
				
				return false;
				
			}
				
			else {
					
				System.out.println("l'ascenseur est ouvert");
				
				return false;
			
			}
		
		}
				
		else {
			
			System.out.println("je ne suis pas dans l'ascenseur");
			
			return false;
			
		}
			
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean appeler() {
	
		if (this.monEtage != this.ascEtage) {
		
			if (this.monEtage < this.ascEtage) {
				
				System.out.println("j'appelle l'ascenseur qui descends me chercher");
				
				this.vitesse = -1;
				
			}
			
			else if (this.monEtage > this.ascEtage) {
				
				System.out.println("j'appelle l'ascenseur qui monte me chercher");
				
				this.vitesse = 1;
				
			}
			
			return true;
		
		}
		
		else {
			
			System.out.println("l'ascenseur est deja a mon etage");
			
			return false;
			
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
}
