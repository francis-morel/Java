package exercice14;

import java.util.Scanner;

public class C04CExercice14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = x;
		
		do {
			System.out.print("Veuillez entrer un entier X entre 1 et 8: ");
			if (scanner.hasNextInt()) {
				x = scanner.nextInt();
			}
			scanner.nextLine();
		} while (x < 1 || x > 8);
		
		do {
			System.out.print("Veuillez entrer un entier Y entre 1 et 8: ");
			if (scanner.hasNextInt()) {
				y = scanner.nextInt();
			}
			scanner.nextLine();
		} while (y < 1 || y > 8);
		
		for (int i = 0 ; i < 8 ; i++) {
			for (int j = 0 ; j < 8 ; j++) {
				if (i == x-1 && j == y-1) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
			}
			System.out.print("\n");
		}
		
		scanner.close();
	}
}
