package robot;

public class Robot {

	// valeurs de la position de 1 au nombre de cases inclus
	private int positionX;
	private int positionY;

	// les orientations possibles dans le sens horaire
	private Direction orientation;

	// stock, exemple 1/1
	private int stockCourant;
	private final int stockMax;

	// energie, exemple 1/3
	private double energieCourante;
	private final double energieMax;

	// le robot commence toujours eteint
	private boolean estAllume = false;

	// tableau carte NOMBRE_CASES x NOMBRE_CASES � remplir avec la fonction cartographier, ne pas depasser 99, 10 par defaut
	private final int NOMBRE_CASES = 10;
	private boolean[][] carte = new boolean[NOMBRE_CASES][NOMBRE_CASES];

	// le robot commence obligatoirement sans carte
	private boolean aCarte = false;

	// couts des actions en energie
	private final double COUT_DEPLACEMENT = 0.05;
	private final double COUT_ROTATION = 0.5;
	
	// gain d'une pile en energie
	private final double GAIN_PILE = 1.0;

	/**
	 * Constructeur par d�faut; programme teste avec cette configuration
	 */
	public Robot() {

		this.positionX = 1;
		this.positionY = 1;
		this.orientation = Direction.BAS;
		this.stockCourant = 0;
		this.stockMax = 1;
		this.energieCourante = 3;
		this.energieMax = 3;
	}

	/**
	 * Constructeur classique
	 * 
	 * @param _positionX        valeur de 1 au nombre de cases
	 * @param _positionY        valeur de 1 au nombre de cases
	 * @param _orientation      haut, droite, bas, gauche
	 * @param _capaciteCourante
	 * @param _capaciteMax      valeur superieure _stockCourant
	 * @param _energie_courante
	 * @param _energieMax          valeur superieure a _energieCourante
	 * @param _estAllume
	 * @param _aCarte           pas de parametre, le robot commence obligatoirement
	 *                          sans carte
	 */
	public Robot(int _positionX, int _positionY, Direction _orientation, int _capaciteCourante, int _capaciteMax,
			double _energie_courante, double _energieMax) {

		this.positionX = _positionX;
		this.positionY = _positionY;
		this.orientation = _orientation;

		this.stockCourant = _capaciteCourante;
		this.stockMax = _capaciteMax;

		this.energieCourante = _energie_courante;
		this.energieMax = _energieMax;
	}

	/**
	 * Avancer le robot d'un certain nombre de cases
	 * 
	 * @param distance
	 * @return a reussi a avancer
	 */
	public boolean avancer(int distance) {

		// le robot doit etre allume
		if (!this.estAllume) {
			return false;
		}

		// la distance ne peut pas etre negative ou superieure � NOMBRE_CASES - 1
		if (distance < 0 || distance > this.NOMBRE_CASES - 1) {
			return false;
		}

		// le robot n'a pas assez de batterie
		if (this.COUT_DEPLACEMENT * distance > this.energieCourante) {
			return false;
		}

		// selon l'orientation
		switch (this.orientation) {

		// avancer en haut, la position ne doit pas etre inferieure a 1
		case HAUT:
			if (this.positionY - distance > 1) {
				this.positionY -= distance;
				this.energieCourante -= this.COUT_DEPLACEMENT * distance;
				return true;
			} else {
				return false;
			}

			// avancer a droite, la grille est limitee a NOMBRE_CASES cases sur l'axe horizontal
		case DROITE:
			if (this.positionX + distance <= this.NOMBRE_CASES) {
				this.positionX += distance;
				this.energieCourante -= this.COUT_DEPLACEMENT * distance;
				return true;
			} else {
				return false;
			}

			// avancer en bas, la grille est limitee a NOMBRE_CASES cases sur l'axe vertical
		case BAS:
			if (this.positionY + distance <= this.NOMBRE_CASES) {
				this.positionY += distance;
				this.energieCourante -= this.COUT_DEPLACEMENT * distance;
				return true;
			} else {
				return false;
			}

			// avancer a gauche, la grille est limitee a 10 cases sur l'axe horizontal
		case GAUCHE:
			if (this.positionX - distance > 1) {
				this.positionX -= distance;
				this.energieCourante -= this.COUT_DEPLACEMENT * distance;
				return true;
			} else {
				return false;
			}

			// aucune des autres orientations est possible
		default:
			return false;
		}
	}

	/**
	 * Tourner le robot, il faut orienter le robot avant d'avancer
	 * 
	 * @param _orientation utiliser les mots haut, droite, bas, gauche
	 * @return a reussi a tourner
	 */
	public boolean tourner(Direction _orientation) {

		// le robot ne doit pas tourner vers la meme orientation
		if (this.orientation == _orientation) {
			return false;
		}

		// le bot ne peut pas tourner s'il la batterie courante est insuffisante
		if (this.energieCourante < this.COUT_ROTATION) {
			return false;
		}

		// l'orientation doit etre haut, droite, bas, gauche
		if (_orientation == Direction.HAUT || _orientation == Direction.DROITE || _orientation == Direction.BAS
				|| _orientation == Direction.GAUCHE) {
			this.orientation = _orientation;
			this.energieCourante -= this.COUT_ROTATION;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Ramasser la pile qui se situe sur la case, il ne peut avoir qu'une pile par
	 * case
	 * 
	 * @return a reussi a ramassser
	 */
	public boolean ramasser() {

		// le robot doit avoir assez de place restante
		if (this.stockCourant >= this.stockMax) {
			return false;
		}

		// si la case actuelle a une pile la ramasser
		if (this.carte[this.positionY - 1][this.positionX - 1]) {
			this.stockCourant += 1;
			// la pile est retiree de la carte
			this.carte[this.positionY - 1][this.positionX - 1] = false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Consommer une pile
	 * 
	 * @return a reussi a consommer la pile
	 */
	public boolean consommerBatterie() {

		if (this.stockCourant >= 1 && this.energieCourante < this.energieMax) {
			this.stockCourant -= 1;
			this.energieCourante += this.GAIN_PILE;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Afficher la carte
	 * 
	 * @return a reussi a afficher la carte
	 */
	public boolean afficherCarte() {

		if (this.aCarte) {
			// afficher les coordonnees pour chaque colonne au dessus de la grille
			for (int y = 0; y < this.carte.length; y++) {
				// cas special avec 10 colonnes ou derniere colonne
				if ((y == 9 && this.NOMBRE_CASES == 10) || y == this.NOMBRE_CASES - 1) {
					if (y >= 9 && y <= 99) {
						System.out.println(y + 1);
					} else {
						System.out.println("0" + (y + 1));
					}
					// premiere colonne
				} else if (y == 0) {
					System.out.print("   0" + (y + 1) + " ");
					// les autres colonnes
				} else {
					if (y >= 10 - 1 && y <= 99 - 1) {
						System.out.print((y + 1) + " ");
					} else {
						System.out.print("0" + (y + 1) + " ");
					}
				}
			}
			
			// afficher la grille
			for (int y = 0; y < this.carte.length; y++) {

				// afficher les coordonn�es pour chaque ligne au debut de chaque ligne
				// ne pas ajouter de 0 lorsqu'il faut afficher 10
				if (y >= 10 - 1 && y <= 99) {
					System.out.print((y + 1) + " ");
				} else {
					System.out.print("0" + (y + 1) + " ");
				}

				// afficher la grille, une case est vide ou une case a une pile
				for (int x = 0; x < this.carte[0].length; x++) {
					
					// sauter a la ligne et ne pas mettre d'espace � la fin de la derniere colonne
					if (x == this.NOMBRE_CASES - 1) {
						if (this.carte[y][x]) {
							System.out.println(" O");
						} else {
							System.out.println(" X");
						}
					} else {
						if (this.carte[y][x]) {
							System.out.print(" O ");
						} else {
							System.out.print(" X ");
						}
					}
				}
			}
			
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Cartographier l'espace sur lequel le robot se trouve note; utilise toujours
	 * la m�me carte pour pouvoir coder les actions � faire dans App
	 * 
	 * @return a reussi a cartographier
	 */
	public boolean cartographier() {

		if (!this.aCarte) {
			// cr�er une grille proportionnel au nombre de cases qui represente un niveau
			boolean[][] _espace = new boolean[NOMBRE_CASES][NOMBRE_CASES];

			// initialiser toutes les cases sans pile
			for (int y = 0; y < _espace.length; y++) {
				for (int x = 0; x < _espace[y].length; x++) {
					_espace[y][x] = false;
				}
			}

			// poser quelques piles
			_espace[(int) (0.2 * this.NOMBRE_CASES)][(int) (0.2 * this.NOMBRE_CASES)] = true;
			_espace[(int) (0.5 * this.NOMBRE_CASES)][(int) (0.7 * this.NOMBRE_CASES)] = true;
			_espace[(int) (0.3 * this.NOMBRE_CASES)][(int) (0.4 * this.NOMBRE_CASES)] = true;
			_espace[(int) (0.6 * this.NOMBRE_CASES)][(int) (0.1 * this.NOMBRE_CASES)] = true;
			_espace[(int) (0.8 * this.NOMBRE_CASES)][(int) (0.9 * this.NOMBRE_CASES)] = true;

			// placer la carte dans l'objet robot
			this.carte = _espace;

			// le robot aura une carte jusqu'� la fin du programme
			this.aCarte = true;

			return true;
		} else {
			return false;
		}
	}

	/**
	 * Allumer le robot
	 * 
	 * @return a reussi a s'allumer
	 */
	public boolean allumer() {

		if (!this.estAllume) {
			this.estAllume = true;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Mettre le robot en veille
	 * 
	 * @return a reussi a s'eteindre
	 */
	public boolean veiller() {

		if (this.estAllume) {
			this.estAllume = false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Compter le nombre de piles sur la carte
	 * 
	 * @return nombre de piles
	 */
	public int compterPilesCarte() {

		int compteur = 0;

		for (int y = 0; y < this.carte.length; y++) {
			for (int x = 0; x < this.carte[y].length; x++) {
				if (this.carte[y][x]) {
					compteur++;
				}
			}
		}

		return compteur;
	}

	/**
	 * Le robot dit si c'est termine.
	 */
	public void commenterCompletion() {

		enum Commentaire {
			VICTOIRE, DEFAITE, EN_COURS
		}

		final Commentaire etatPartie;

		// il doit rester 0 pile sur la carte et le robot doit etre eteint
		if (this.compterPilesCarte() == 0 && !this.estAllume) {
			etatPartie = Commentaire.VICTOIRE; 			
			// le robot ne peut plus avancer car il n'a plus assez d'energie
			// le robot peut encore avancer mais ne peut plus tourner et est face � un mur
			// le robot n'a plus de stock de pile a consommer			
			// la case ou se situe le robot n'a pas de pile a ramasser
		} else if (this.compterPilesCarte() != 0
				&& (this.energieCourante < this.COUT_DEPLACEMENT || (this.energieCourante < this.COUT_ROTATION
						&& ((this.orientation == Direction.HAUT && this.positionY == 1)
								|| (this.orientation == Direction.DROITE && this.positionX == this.NOMBRE_CASES)
								|| (this.orientation == Direction.BAS && this.positionY == this.NOMBRE_CASES)
								|| (this.orientation == Direction.GAUCHE && this.positionX == 1)))
						&& this.stockCourant == 0 && !this.carte[this.positionY - 1][this.positionX - 1])) {
			etatPartie = Commentaire.DEFAITE;
			// le robot n'a pas fini sa collecte
		} else {
			etatPartie = Commentaire.EN_COURS;
		}

		switch (etatPartie) {
		case VICTOIRE:
			System.out.println("J'ai gagn�!");
			break;
		case DEFAITE:
			System.out.println("J'ai perdu.");
			break;
		case EN_COURS:
			System.out.println("J'ai pas fini...");
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {

		return "\npositionX = " + this.positionX + "\npositionY = " + this.positionY + "\norientation = "
				+ this.orientation + "\ncapaciteCourante = " + this.stockCourant + "\ncapaciteMax = " + this.stockMax
				+ "\nenergieCourante = " + this.energieCourante + "\nenergieMax = " + this.energieMax + "\nestAllume = "
				+ this.estAllume + "\naCarte = " + this.aCarte + "\n";
	}
}