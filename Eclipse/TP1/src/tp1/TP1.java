package tp1;

import java.util.Scanner;

public class TP1 {
	public static void main(String[] args) {
		final int ITERATION_LIMITE = 1000000;
		Scanner scanner = new Scanner(System.in);
		while (menuPrincipal(scanner)) { // Appel de la fonction du menu principal et tant que la valeur de retour est
											// true on refait une nouvelle approx de PI
			System.out.print(
					"\nCombien d'iterations pour le calcul de l'approximation de PI? (1 - " + ITERATION_LIMITE + "): ");
			int nombreIteration = demanderInt(scanner); // On demande à l'utilisateur combien d'itération il veut faire
														// et on garde la valeur dans une variable
			if (nombreIteration > 0 && nombreIteration <= ITERATION_LIMITE) { // si la valeur est valide et qu'elle ne
																				// dépasse pas 1000000, on fait le
																				// calcul, sinon on boucle, donc on
																				// revient au menu principal
				System.out.println("\nCalcul de l'approximation de pi avec " + nombreIteration + " iterations: ");
				double approximationPI = calculApproximationPI(nombreIteration);
				System.out.println("Resultat: " + approximationPI);
				System.out.println("Rendement: " + rendement(approximationPI - 2.4, Math.PI - 2.4) + "%");
				System.out.println();
			} else {
				System.out.println("!! Nombre d'iterations invalide. La valeur doit etre entre 1 et " + ITERATION_LIMITE
						+ " !!\n");
			}
		}
		System.out.println("Fermeture du logiciel...");
		// Execution du programme complétée; fermeture du scanner;
		scanner.close();
	}

	public static boolean menuPrincipal(Scanner scanner) {
		while (true) {
			System.out.println("Menu principal:");
			System.out.println("1. Calculer l'approximation de PI");
			System.out.println("2. Quitter");
			System.out.print("Votre choix? ");
			int retour = demanderInt(scanner);

			if (retour == 1)
				return true; // Si le choix de l'utilisateur est 1.; effectuer une approximation, on retourne
								// true pour entrer dans la boucle
			else if (retour == 2)
				return false; // Si l'utilisateur entre autre 2 on retourne false donc on quitte le logiciel

			System.out.println("\n!! Choix invalide !!"); // si la valeur est invalide on affiche un message d'erreur et
															// on reste dans la boucle
		}
	}

	public static int demanderInt(Scanner scanner) {
		int retour = -1;
		if (scanner.hasNextInt()) {
			retour = scanner.nextInt();
		}
		scanner.nextLine();
		return retour;
	}

	public static double calculApproximationPI(int iteration) {
		double total = 0.0;
		for (int i = 1; i <= iteration; i++) {
			total += 1.0 / Math.pow(i, 2);
		}
		return Math.sqrt(total * 6);

	}

	public static double rendement(double valeur, double comparaison) {
		double rendement = (valeur - comparaison) / comparaison * 100;
		rendement = 100 - Math.sqrt(Math.pow(rendement, 2));
		return garderUneDecimale(rendement);
	}

	public static double garderUneDecimale(double valeur) {
		return (Math.round(valeur * 10) / 10.0);
	}
}
