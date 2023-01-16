package suite_conway;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Suite de Conway");
		
		String valeurs = "11211";
		
		String chiffre = valeurs.substring(0, 1); // lis le 1er charactère de la chaine "valeurs"
		
		// char chiffre = valeurs.charAt(0);
		
		int occurences = 1;
		
		String resultat = "";
		
		for(int i = 1; i < valeurs.length(); i++) {
		
			String charactere = valeurs.substring(i, i+1); // lis le charactere à la position i 
			
			if(chiffre.equals(charactere)) { // si chiffre == charactere 
				++occurences; // occurences++; // occurences = occurences + 1; // occurences += 1;
				
				
			}
			else {
				// changement de charactere
				resultat = resultat + "" + occurences + "" + valeurs.substring(i-1, i);
				chiffre = charactere; // on stocke le nouveau charactere 
				occurences = 1; // reinitialise le compteur
			}
			
			
		} // fin for
		
		// affichage du nombre d'occurences 
			resultat = resultat + "" + occurences + "" + valeurs.charAt(valeurs.length()-1);
			
			// affichage du résultat
			System.out.println(resultat);
	}

}
