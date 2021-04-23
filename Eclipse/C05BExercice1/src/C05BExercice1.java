import java.util.Random;
import java.util.Scanner;

public class C05BExercice1 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int taille_x = -1;
		do {
			System.out.print("Hauteur : ");
			if (clavier.hasNextInt())
				taille_x = clavier.nextInt();
			else
				clavier.nextLine();
		} while (taille_x < 0);

		int taille_y = -1;
		do {
			System.out.print("Largeur : ");
			if (clavier.hasNextInt())
				taille_y = clavier.nextInt();
			else
				clavier.nextLine();
		} while (taille_y < 0);

		for (int x = 1; x <= taille_x; x++) {
			for (int y = 1; y <= taille_y; y++) {
				if (x == 1 || x == taille_x)
					System.out.print('X');
				else if (y == 1 || y == taille_y)
					System.out.print('X');
				else
					System.out.print(' ');
			}
			System.out.print("\n");
		}
	}

}
