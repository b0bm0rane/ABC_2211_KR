package robot;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Robot robotChat	= new Robot(false, 80, false, "Pixel", false); // allume, niveauCharge, branche, nom, queue
	
	System.out.println(robotChat.toString());
	
	System.out.println();
	
	robotChat.miauler();
		
	robotChat.allumer();
	
	robotChat.miauler();
	
	robotChat.remueQueue();
	
	robotChat.ronron();
	
	System.out.println();
	
	System.out.println(robotChat.toString());
	
	}

}
