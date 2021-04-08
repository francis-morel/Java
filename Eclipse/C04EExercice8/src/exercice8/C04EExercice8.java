package exercice8;

import java.util.Scanner;

public class C04EExercice8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Moyenne: ");
		double moyenne = askDouble(scanner);

		System.out.print("Écart-type: ");
		double ecartType = askDouble(scanner);

		System.out.print("Valeur: ");
		double valeur = askDouble(scanner);

		// Je suis vraiment pas certain de comment faire le calcul

		double result = Math.pow(1.0 / (ecartType * Math.sqrt(2.0 * Math.PI)),
				-1.0 / 2.0 * Math.pow((valeur - moyenne) / ecartType, 2.0));

		// double result2 = (1.0 / (ecartType * Math.sqrt(2 * Math.PI))) *
		// Math.exp(-(1.0/2.0) * Math.pow((valeur - moyenne)/ecartType, 2));

		System.out.println(result);

		scanner.close();
	}

	public static double askDouble(Scanner scanner) {
		double retour = 0.0;
		do {
			System.out.print("? ");
			if (scanner.hasNextDouble()) {
				retour = scanner.nextDouble();
			}
			scanner.nextLine();
		} while (retour < 0.0001);

		return retour;
	}

}
