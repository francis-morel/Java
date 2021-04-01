package exercice11;

import java.util.Scanner;

public class C04CExercice11 {
	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		int jour = 0;
		int mois = 0;
		int annee = 0;

		do {
			System.out.print("Veuillez entrer votre jour de naissance: ");
			jour = clavierInt(clavier);
		} while (jour < 1 || jour > 31);

		do {
			System.out.print("Veuillez entrer votre mois de naissance: ");
			mois = clavierInt(clavier);
		} while (mois < 1 || mois > 12);

		do {
			System.out.print("Veuillez entrer votre annee de naissance: ");
			annee = clavierInt(clavier);
		} while (annee < 1900);

		System.out.println("Votre date de naissance est le " + jour + " " + conversionMoisString(mois) + " " + annee);

		clavier.close();
	}

	public static int clavierInt(Scanner clavier) {
		if (clavier.hasNextInt()) {
			return clavier.nextInt();
		}
		clavier.nextLine();
		return -1;
	}

	public static String conversionMoisString(int mois) {

		String moisString = "Error";

		switch (mois) {
		case 1:
			moisString = "janvier";
			break;
		case 2:
			moisString = "février";
			break;
		case 3:
			moisString = "mars";
			break;
		case 4:
			moisString = "avril";
			break;
		case 5:
			moisString = "mai";
			break;
		case 6:
			moisString = "juin";
			break;
		case 7:
			moisString = "juillet";
			break;
		case 8:
			moisString = "aout";
			break;
		case 9:
			moisString = "septembre";
			break;
		case 10:
			moisString = "octobre";
			break;
		case 11:
			moisString = "novembre";
			break;
		case 12:
			moisString = "décembre";
			break;
		}

		return moisString;
	}
}
