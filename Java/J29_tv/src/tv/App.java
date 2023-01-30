package tv;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv maTv = new Tv("plastique", 100, true,"noire","LG", 5, false);
		
		Boolean aReussi= maTv.allumer();
		Boolean aReussi2= maTv.allumer();
		
		
		maTv.eteindre();
		
	}

}
