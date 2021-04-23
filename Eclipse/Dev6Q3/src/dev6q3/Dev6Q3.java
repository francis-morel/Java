package dev6q3;

import java.util.Scanner;

public class Dev6Q3 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrez une première valeur flottante : ");
		double v1;
		if (clavier.hasNextDouble()) {
			v1 = clavier.nextDouble();
		} else {
			v1 = -1.0;
		}
		clavier.nextLine();
		System.out.print("Entrez une deuxième valeur flottante : ");
		double v2;
		if (clavier.hasNextDouble()) {
			v2 = clavier.nextDouble();
		} else {
			v2 = -1.0;
		}
		double produit = v1 * v2;
		System.out.println(produit);
		clavier.close();
	}
}