package random;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min;
		
		int max;
		
		int random1;
		
		int random2;
		
		int random3;
		
		min = 5;
		
		max = 15;
		
		random1 = (int) (Math.random() * ( max - min ));
		
		System.out.println(random1);
		
		random2 = (int) (min + (Math.random() * (max-min)));
		
		System.out.println(random2);
		
		random3 = (int) (min + Math.random() * (max - min) + 1);
		
		System.out.println(random3);
		
		Random rand = new Random();
		
		int nombreAléatoire = rand.nextInt(max - min + 1) + min;
		
		System.out.println(nombreAléatoire);
		
	}

}
