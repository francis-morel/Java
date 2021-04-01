package dev3q2;

import java.util.Scanner;

public class Dev3Q2 {
	public static void main(String[] args) {

		Scanner lecteur = new Scanner(System.in);
		System.out.print("Entrez une valeur flottante : ");
		float valeur = lecteur.nextFloat();

		if (valeur < 0) {
			System.out.println("Erreur");
		} else if (valeur == 0) {
			System.out.println("Nul");
		} else if (valeur >= 0 && valeur <= 1) {
			System.out.println("Fractionnaire");
		} else if (valeur == 1) {
			System.out.println("Unité");
		} else if (valeur > 1) {
			System.out.println("Supérieur");
		}

		lecteur.close();
	}
}