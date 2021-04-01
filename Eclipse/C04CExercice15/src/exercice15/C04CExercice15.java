package exercice15;

import java.util.Scanner;

public class C04CExercice15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] noms = new String[3];
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("Veuillez entrer le nom #" + (i+1) + " : ");
			noms[i] = scanner.nextLine();
		}
		
		System.out.println("\nVoici la liste de noms:");
		for(String nom : noms) {
			System.out.println(nom);
		}
		
		scanner.close();
	}
}
