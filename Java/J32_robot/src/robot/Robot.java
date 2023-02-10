package robot;

public class Robot {

	private boolean allume;
	
	private int niveauCharge;
	
	private boolean branche;
	
	private String nom;
	
	private String miaou;

	private String ronron;
	
	private boolean queue;
	
	public Robot (boolean allume, int niveauCharge, boolean branche, String nom, String miaou, String ronron, boolean queue) {
		
		this.allume = allume;
		
		this.niveauCharge = niveauCharge;
		
		this.branche = branche;
		
		this.nom = nom;
		
		this.miaou = "Miaou !, miaouuuuu !!, miaouuuuuuuuuu !!!";
		
		this.ronron = "Rrrrrrrrrr ... ";
		
		this.queue = queue;
		
		}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean allumer() {
		
		if (!this.allume) {
			
			if (this.niveauCharge > 0 || this.branche) {
				
				this.allume = true;
			
				return true;
		
			}
				
			else {
				
				return false;
				
			}
	
		}
		
		else {
			
				return false;
		
		}	
	
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
public boolean eteindre() {
		
		if (this.allume) {
			
				this.allume = false;
			
				return true;
		
			}
				
		else {
				
				return false;
	
		}		
				
	}			
				
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public boolean miauler() {
	
		if (this.allume) {
			
			
			
		}
	
	}

}