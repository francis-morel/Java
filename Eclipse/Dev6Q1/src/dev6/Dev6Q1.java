package dev6;

import java.util.Scanner;

public class Dev6Q1 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int premier = obtenirEntier(clavier, "comme première valeur");
		int deuxieme = obtenirEntier(clavier, "comme deuxième valeur");
		clavier.close();
		int somme = premier + deuxieme;
		System.out.println("Somme = " + somme);
	}

	public static int obtenirEntier(Scanner lecteur, String nom) {
		int valeur = 0;
		do {
			System.out.print("Entrez un entier " + nom + " entre -10 et +10 : ");
			if (lecteur.hasNextInt()) {
				valeur = lecteur.nextInt();
			}
			// On vide le tampon
			lecteur.nextLine();
		} while (valeur < -10 || valeur > 10);
		return valeur;
	}

}
