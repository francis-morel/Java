package ex7;

import java.util.Scanner;
import java.util.ArrayList;

public class Cours06B_Exercice7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> listeDouble = new ArrayList<Double>();
		
		System.out.print("Combien de valeurs décimales voulez-vous entrer? ");
		final int nombreDecimales = askInt(scanner);
		
		for (int i = 0; i < nombreDecimales; i++) {
			listeDouble.add(askDouble(scanner, "Veuillez entrer une valeur décimale (" + (i+1) + "): "));
		}
		
		for(int i = 0; i < listeDouble.size(); i++) {
			System.out.println(listeDouble.get(i));
		}

	}

	public static int askInt(Scanner scanner) {
		int entier = -1;
		while (true) {
			if (scanner.hasNextInt()) {
				entier = scanner.nextInt();
				scanner.nextLine();
				return entier;
			}
			scanner.nextLine();
		}
	}

	public static double askDouble(Scanner scanner, String message) {
		double decimale = 0.0;
		while (true) {
			System.out.print(message);
			if (scanner.hasNextDouble()) {
				decimale = scanner.nextDouble();
				scanner.nextLine();
				return decimale;
			}
			scanner.nextLine();
		}
	}

}
