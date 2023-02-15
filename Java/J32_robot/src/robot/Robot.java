package robot;

public class Robot {

	private boolean allume;
	
	private int niveauCharge;
	
	private boolean branche;
	
	private String nom;
	
	private String miaou;

	private String ronron;
	
	public Robot(boolean _allume, int _niveauCharge, boolean _branche, String _nom) {
		
		this.allume = _allume;
		
		this.niveauCharge = _niveauCharge;
		
		this.branche = _branche;
		
		this.nom = _nom;
		
		this.miaou = "Miaou !, miaouuuuu !!, miaouuuuuuuuuu !!!";
		
		this.ronron = "Rrrrrrrrrr ... ";
		
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean allumer() {
		
		if (!this.allume) {
			
			if (this.niveauCharge > 0 || this.branche) {
				
				this.allume = true;
			
				System.out.println("le robot s allume");
				
				return true;
		
			}
				
			else {
				
				System.out.println("impossible d'allumer le robot");
				
				return false;
				
			}
	
		}
		
		else {
			
				System.out.println("le robot est deja allume");
				
				return false;
		
		}	
	
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean eteindre() {
		
		if (this.allume) {
			
				this.allume = false;
			
				System.out.println("le robot s'eteint");
				
				return true;
		
			}
				
		else {
				
				System.out.println("le robot est deja eteint");
				
				return false;
	
		}		
				
	}			
				
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean brancher() {
		
		if (!this.branche) {
			
				this.branche = true;
			
				System.out.println("je branche le robot");
				
				return true;
	
			}
			
		else {
			
				System.out.println("le robot est deja branche");
				
				return false;
			
		}
			
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean debrancher() {
		
		if (this.branche) {
			
				this.branche = false;
			
				System.out.println("je debranche le robot");
				
				return true;
	
			}
			
		else {
			
				System.out.println("le robot est deja debranche");
				
				return false;
			
		}
			
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean recharger() {
		
		if (this.branche) {
			
				this.niveauCharge = 100;
				
				System.out.println("le robot est recharge");
				
				return true;
			}
		
		else {
			
				return false;
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public boolean miauler() {
	
		if (this.allume) {
			
			System.out.println(this.miaou);
			
			this.niveauCharge = this.niveauCharge - 5;
			
			return true;
			
		}
	
		else {
			
			System.out.println("le robot est eteint");
			
			return false;
			
		}
		
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public boolean ronron() {
	
		if (this.allume) {
		
			System.out.println(this.ronron);
		
			this.niveauCharge = this.niveauCharge - 5;
			
			return true;
		
		}
	
		else {
		
			System.out.println("le robot est eteint");
			
			return false;
		
		}
		
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public boolean remuerQueue() {
	
		if (this.allume) {
			
			System.out.println("le robot remue la queue");
			
			this.niveauCharge = this.niveauCharge - 10;
			
			return true;
			
		}
		
		else {
			
			System.out.println("le robot est eteint");
			
			return false;
		}
	
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public String toString() {
	
	return "nom : " + this.nom + "\n" + "allume : " + this.allume + "\n" + "niveauCharge : " + this.niveauCharge + "\n" + "branche : " + this.branche + "\n";
	
	}

}