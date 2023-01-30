package porte_garage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PorteGarage maPorteAuto = new PorteGarage ("metal", "blanche", false, true);
		
		maPorteAuto.ouvrir();
		
		maPorteAuto.fermer();
		
		maPorteAuto.verrouiller();
		
		maPorteAuto.deverrouiller();
		
	}

}
