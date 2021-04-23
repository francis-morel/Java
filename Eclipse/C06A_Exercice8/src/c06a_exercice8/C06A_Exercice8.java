package c06a_exercice8;

import java.util.Random;

public class C06A_Exercice8 {
	public static void main(String[] args) {
		final int NOMBRE_VALEURS = 50;
		final int VALEUR_MIN = 1;
		final int VALEUR_MAX = 10;
		
		Random random = new Random();
		int[] joueur1 = new int[NOMBRE_VALEURS];
		int[] joueur2 = new int[NOMBRE_VALEURS];
		
		for (int i = 0; i < NOMBRE_VALEURS; i++) {
			joueur1[i] = random.nextInt(VALEUR_MAX-VALEUR_MIN+1) + VALEUR_MIN;
			joueur2[i] = random.nextInt(VALEUR_MAX-VALEUR_MIN+1) + VALEUR_MIN;
		}
		
		int scoreP1 = 0;
		int scoreP2 = 0;
		
		for (int i = 0; i < NOMBRE_VALEURS; i++) {
			//System.out.println(i + ": " + joueur1[i] + " et " + joueur2[i]);
			if (joueur1[i] > joueur2[i]) {
				System.out.println(joueur1[i] + " > " + joueur2[i] + " : Joueur1 gagne");
				scoreP1++;
			} else if (joueur1[i] < joueur2[i]) {
				System.out.println(joueur1[i] + " < " + joueur2[i] + " : Joueur2 gagne");
				scoreP2++;
			} else {
				System.out.println(joueur1[i] + " = " + joueur2[i] + " : Egalite");
			}
		}
		
		System.out.println("Joueur 1: " + scoreP1 + " Joueur 2: " + scoreP2);
		if (scoreP1 > scoreP2) {
			System.out.println("Joueur 1 gagne!");
		} else if (scoreP1 < scoreP2) {
			System.out.println("Joueur 2 gagne!");
		} else {
			System.out.println("Egalite!");
		}
	}
}
