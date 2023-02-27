package robot;

public class Telecommande {

	private Robot robot;
	
	public Telecommande(Robot _robot) {
		
		this.robot = _robot;
		
	}
	
	
	public boolean boutonOn() {
		
		return this.robot.allumer();
				
	}
	
	public boolean boutonOff() {
		
		return this.robot.eteindre();
				
	}
	
	public boolean boutonMiauler() {
		
		return this.robot.miauler();
		
	}
	
	public boolean boutonRonronner() {
		
		return this.robot.ronron();
		
	}
	
	public boolean boutonDodo() {
		
		return this.robot.dodo();
		
	}
	
	public boolean boutonRemuerQueue() {
		
		return this.robot.remuerQueue();
		
	}
	
	public boolean boutonPapattes() {
		
		return this.robot.papattes();
		
	}
	
}
