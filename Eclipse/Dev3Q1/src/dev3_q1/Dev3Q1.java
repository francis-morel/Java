/* Q1a. Expliquez pourquoi le logiciel ne fonctionne pas tel que prévu.
 * R. Aussitôt qu'un "if" est vrai, le logiciel sort du bloc if et continu son execution.
 * Il faut donc mettre les conditions prioritaires en premier.
 */

package dev3_q1;

import java.util.Scanner;

public class Dev3Q1 {
	public static void main(String[] args) {

		Scanner lecteur = new Scanner(System.in);
		System.out.print("Entrez un entier : ");
		int valeur = lecteur.nextInt();
		if (valeur < 1) {
			System.out.println("Valeur < 1");
		} else if (valeur < 10) {
			System.out.println("Valeur < 10");
		} else if (valeur < 50) {
			System.out.println("Valeur < 50");
		} else if (valeur < 100) {
			System.out.println("Valeur < 100");
		}
		lecteur.close();
	}
}
