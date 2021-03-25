import java.util.Scanner;

public class Cours04AExercice5 {
    public static void main(String[] args0) {
        final int NOMBRE_MOYENNE = 3;

        Scanner lecteur = new Scanner(System.in);

        int[] liste = new int[NOMBRE_MOYENNE];

        for (int i = 0; i < NOMBRE_MOYENNE; i++) {
            System.out.print("Entrez la valeur " + (i + 1) + " : ");
            if(lecteur.hasNextInt()) {
                liste[i] = lecteur.nextInt();
                lecteur.nextLine();
                continue;
            }
            lecteur.nextLine();
            liste[i] = 0;
        }

        int total = 0;

        for (int i : liste) {
            total += i;
        }

        System.out.println((double) total / NOMBRE_MOYENNE);
        lecteur.close();
    }
}