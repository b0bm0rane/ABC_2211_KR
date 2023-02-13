package robot;

public class Robot {

	private boolean allume;
	
	private int niveauCharge;
	
	private boolean branche;
	
	private String nom;
	
	private String miaou;

	private String ronron;
	
	private boolean queue;
	
	public Robot(boolean _allume, int _niveauCharge, boolean _branche, String _nom, boolean _queue) {
		
		this.allume = _allume;
		
		this.niveauCharge = _niveauCharge;
		
		this.branche = _branche;
		
		this.nom = _nom;
		
		this.miaou = "Miaou !, miaouuuuu !!, miaouuuuuuuuuu !!!";
		
		this.ronron = "Rrrrrrrrrr ... ";
		
		this.queue = _queue;
		
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
			
				System.out.println("le robot s eteinds");
				
				return true;
		
			}
				
		else {
				
				System.out.println("le robot est deja eteinds");
				
				return false;
	
		}		
				
	}			
				
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public boolean miauler() {
	
		if (this.allume) {
			
			System.out.println(this.miaou);
			
			return true;
			
		}
	
		else {
			
			System.out.println("le robot est eteinds");
			
			return false;
			
		}
		
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public boolean ronron() {
	
		if (this.allume) {
		
			System.out.println(this.ronron);
		
			return true;
		
		}
	
		else {
		
			System.out.println("le robot est eteinds");
			
			return false;
		
		}
	}

}