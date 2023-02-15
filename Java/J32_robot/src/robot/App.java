package robot;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Robot robotChat	= new Robot(true, 80, true, "Pixel"); // allume, niveauCharge, branche, nom
	
	Telecommande telRobotChat = new Telecommande(robotChat);
	
	System.out.println(robotChat.toString());
	
	robotChat.eteindre();
	
	robotChat.recharger();
	
	System.out.println("\n" + robotChat.toString());
	
	telRobotChat.boutonOn();
	robotChat.debrancher();
	robotChat.remuerQueue();
	robotChat.remuerQueue();
	robotChat.remuerQueue();
	robotChat.remuerQueue();
	robotChat.remuerQueue();
	robotChat.allumer();
	
	System.out.println("\n" + robotChat.toString());
	
	}

}
