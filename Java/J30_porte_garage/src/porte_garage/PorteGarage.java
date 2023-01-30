package porte_garage;

public class PorteGarage {
	
	private String matiere;
	
	private String couleur;
	
	private boolean ouverte;
	
	private boolean verrouillee;
	
	public PorteGarage (String mat, String coul, boolean ouv, boolean ver) {
	
	this.matiere = mat;
	
	this.couleur = coul;
	
	this.ouverte = ouv;
	
	this.verrouillee = ver;
	
	}
	
	public void ouvrir() {
		
		this.ouverte = true;
				
			System.out.println("j'ai ouvert ma porte de garage");
	
	}
			
	public void fermer() {
		
		this.ouverte = false;
		
			System.out.println("j'ai ferme ma porte de garage");		
			
	}
	
	public void verrouiller() {
		
		this.verrouillee = true;
		
			System.out.println("j'ai verrouille ma porte de garage");
		
	}		
			
	public void deverrouiller() {
		
		this.verrouillee = false;
		
			System.out.println("j'ai deverrouille ma porte de garage");
			
	}
	
}
