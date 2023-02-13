package robot;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Robot robotChat	= new Robot(false, 80, false, "Pixel", false); // allume, niveauCharge, branche, nom, queue
	
	robotChat.miauler();
		
	robotChat.allumer();
	
	robotChat.miauler();
	
	robotChat.remueQueue();
	
	robotChat.ronron();
	
	robotChat.eteindre();
	
	}

}
