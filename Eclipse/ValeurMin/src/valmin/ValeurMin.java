package valmin;

import java.util.Scanner;

public class ValeurMin {
	public static void main(String[] args) {
	int[] valeurs = new int[5];
	Scanner scanner = new Scanner(System.in);
	
	for (int i = 0; i < 5; i++) {
		int val = -1;
		do {
			System.out.print("Entrez la valeur " + (i+1) + " (0 - 100) : ");
			if (scanner.hasNextInt()) {
				val = scanner.nextInt();
			}
			scanner.nextLine();
		} while (val < 0 || val > 100);
		
		valeurs[i] = val;
				
	}
	scanner.close();
	
	int somme = 0;
	int min = 100;
	for (int val : valeurs) {
		somme += val;
		if (min > val) min = val;
	}
	
	double moyenne = somme / 5.0;
	
	System.out.println("La moyenne est : " + moyenne);
}
}
