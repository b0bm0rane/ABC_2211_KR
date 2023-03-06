package robot;

public class Robot {

	private boolean allume;
	
	private int niveauCharge;
	
	private boolean branche;
	
	private String nom;
	
	private String miaou;

	private String ronron;
	
	private String dodo;
	
	public Robot(boolean _allume, int _niveauCharge, boolean _branche, String _nom) {
		
		this.allume = _allume;
		
		this.niveauCharge = _niveauCharge;
		
		this.branche = _branche;
		
		this.nom = _nom;
		
		this.miaou = "Miaou !, miaouuuuu !!, miaouuuuuuuuuu !!!";
		
		this.ronron = "Rrrrrrrrrr ... ";
		
		this.dodo = "ZZZZZZZZZZ ...";
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean allumer() {
		
		if (!this.allume) {
			
			if (this.niveauCharge > 0 || this.branche) {
				
				this.allume = true;
			
				System.out.println("le robot s'allume");
				
				return true;
		
			}
				
			else {
				
				System.out.println("le robot ne peut pas s'allumer");
				
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
	
	private boolean decharger(int decharge) {
		
		this.niveauCharge = this.niveauCharge - decharge;
		
		if (this.niveauCharge <= 0) {
			
				this.niveauCharge = 0;
			
				System.out.println("le robot est decharge");
			
				System.out.println("le robot a besoin de se reposer, l'enfant est griffe et fait une hemorragie");
				
				return this.eteindre();
			
		}
		
				return true;
		
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
			
			this.decharger(10);
			
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
		
			this.decharger(10);
			
			return true;
		
		}
	
		else {
		
			System.out.println("le robot est eteint");
			
			return false;
		
		}
		
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public boolean dodo() {
		
		if (this.allume) {
		
			System.out.println(this.dodo);
		
			this.decharger(10);
			
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
			
			this.decharger(15);
			
			return true;
			
		}
		
		else {
			
			System.out.println("le robot est eteint");
			
			return false;
		}
	
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean papattes() {
		
		if (this.allume) { 
			
			System.out.println("le robot fait ses papattes");
			
			this.decharger(20);
			
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