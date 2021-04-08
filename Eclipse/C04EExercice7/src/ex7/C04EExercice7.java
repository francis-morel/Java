package ex7;

import java.util.Scanner;

public class C04EExercice7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Combien de fois désirez-vous lancer la pièce? ");
		int nombreLance = askIntRange(scanner, 1, 20);

		System.out.print("Combien de fois retombe-t-elle du côté face? ");
		int nombreFace = askIntRange(scanner, 0, nombreLance);

		System.out.println("Les probabilitées qu'une pièce lancée " + nombreLance + " fois retombe du côté face "
				+ nombreFace + " fois sont de " + probabiletePieceTombeCoteFace(nombreLance, nombreFace) + "%");

		scanner.close();
	}

	public static int askIntRange(Scanner scanner, int low, int high) {
		int retour = 0;
		do {
			System.out.print("(" + low + " - " + high + "): ");
			if (scanner.hasNextInt()) {
				retour = scanner.nextInt();
			}
			scanner.nextLine();
		} while (retour < low || retour > high);
		return retour;
	}

	public static long factorielle(int nombre) {
		long resultat = 1;
		for (int i = 1; i <= nombre; i++) {
			resultat *= i;
		}
		return resultat;
	}

	public static double probabiletePieceTombeCoteFace(int n, int k) {
		return (((factorielle(n)) / ((factorielle(k)) * (factorielle(n - k)))) * Math.pow(0.5, n)) * 100.0;
	}
}
