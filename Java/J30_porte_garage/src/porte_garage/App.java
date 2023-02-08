package porte_garage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PorteGarage maPorteAuto = new PorteGarage (false, false);
		
		//ouverte, verrouillee
		
		maPorteAuto.fermer();
		
		System.out.println(maPorteAuto.toString());
		
	}

}
