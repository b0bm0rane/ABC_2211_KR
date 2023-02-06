package ascenseur;

public class Ascenseur {

	private boolean ouvert;
	
	private int vitesse;
	
	private int monEtage;
	
	private int ascEtage;
	
	private int etageMini;
	
	private int etageMaxi;
	
	public Ascenseur (boolean ouvert, int vitesse, int monEtage, int ascEtage, int etageMini, int etageMaxi) {
		
		this.ouvert = ouvert;
		
		this.vitesse = vitesse;
		
		this.ascEtage = ascEtage;
		
		this.monEtage = monEtage;
		
		this.etageMini = etageMini;
		
		this.etageMaxi = etageMaxi;
		
	}
	
	// TODO KR appeler monter descendre
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean ouvrir() {
		
		if (this.monEtage == this.ascEtage) {
		
			if (this.vitesse == 0) {
				
				if (this.ouvert == false) {
				
				System.out.println("j'ouvre la porte de l'ascenseur");
			
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
		
		if (!this.ouvert) {
		
			if (this.monEtage > this.ascEtage) 
			
			System.out.println("l'ascenseur monte");
			
			this.vitesse = 1;
			
			return true;
			
		}
			
		else {
				
			System.out.println("l'ascenseur est ouvert");
			
			return false;
		
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean descendre() {
		
		if (!this.ouvert) {
		
			if (this.monEtage < this.ascEtage) 
			
			System.out.println("l'ascenseur descends");
			
			this.vitesse = -1;
			
			return true;
			
		}
			
		else {
				
			System.out.println("l'ascenseur est ouvert");
			
			return false;
		
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean appeler() {
	
		if (this.monEtage != this.ascEtage) {
		
			if (this.monEtage < this.ascEtage) {
				
				System.out.println("j'appelle l'ascenseur qui descends me chercher");
				
			}
			
			else if (this.monEtage > this.ascEtage) {
				
				System.out.println("j'appelle l'ascenseur qui descends me chercher");
				
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
