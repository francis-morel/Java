package exercice13;

import java.util.Random;
import java.util.Scanner;

public class C04CExercice13 {
	
	public static void main (String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String rejouer = "";
		
		do {
			int mystere = random.nextInt(99) + 1;
			int devine = 0;
			 do {
				 System.out.print("Veuillez entrer un nombre entre 1 et 100: ");
				 if (scanner.hasNextInt()) {
					 devine = scanner.nextInt();
				 }
				 scanner.nextLine();
				 
				 if (mystere > devine) {
					 System.out.println("Le nombre myst�re est plus grand");
				 } else if (mystere < devine) {
					 System.out.println("Le nombre myst�re est plus petit");
				 }
				 
			 } while (devine != mystere);
			 
			 System.out.println("Gagne! Le nombre myst�re est " + mystere + "!!");
			 
			 System.out.print("Voulez-vous rejouer? (o/n): ");
			 rejouer = scanner.nextLine();
			 //System.out.println(rejouer);
		} while (rejouer.equals("o") || rejouer.equals("O"));
		
		scanner.close();
	}
}
