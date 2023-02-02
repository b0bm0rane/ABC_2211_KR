package porte_garage;

public class PorteGarage {
	
	private boolean ouverte;
	
	private boolean verrouillee;
	
	public PorteGarage (boolean ouverte, boolean verrouillee) {
		
		this.ouverte = ouverte;
		
		this.verrouillee = verrouillee;
	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean ouvrir() {
		
		if (!this.verrouillee) {
			
			if (!this.ouverte) {
				
				System.out.println("j'ouvre ma porte de garage");

				this.ouverte = true;
				
				return true;
				
			}
		
			else {
				
				System.out.println("ma porte de garage est deja ouverte");
				
				return false;
				
				}
				
			}
		
		else {
			
			System.out.println("ma porte de garage est verrouillee");
			
			return false;
			
		}
			
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean fermer() {
		
		if (!this.verrouillee) {
			
			if (this.ouverte) {
				
				System.out.println("je ferme ma porte de garage");
		
				this.ouverte = false;
				
				return true;
				
			}
			
			else System.out.println("ma porte de garage est deja fermee");
			
			return false;
			
		}
		
		else {
			
			System.out.println("ma porte de garage est verrouillee");
			
			return false;
			
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean verrouiller() {
		
		if (this.verrouillee) {
		
			System.out.println("ma porte de garage est deja verrouillee");
			
			return false;
		
		}		
		
		else {
			
			this.verrouillee = true;
			
			System.out.println("je verrouille ma porte de garage");
			
			return true;
			
		}
			
	}	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean deverrouiller() {
		
		if (!this.verrouillee) {
		
			System.out.println("ma porte de garage est deja deverrouillee");
			
			return false;
			
		}
	
		else {
			
			this.verrouillee = false;
			
			System.out.println("je deverrouille ma porte de garage");
			
			return true;
			
		}
	}

}	