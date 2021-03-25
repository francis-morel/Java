import java.util.Scanner;

public class Cours04BExercice3 {

    public static double aireCarre(int cote) {
        return (double)cote*cote;
    }

    public static double aireTriangle(int cote) {
        return ((double)cote*cote)/2.0;
    }
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);

        System.out.print("Entrez un côté : ");
        int cote = Integer.parseInt(lecteur.nextLine());

        System.out.print("Calcul de l'aire d'un carré (1) ou d'un triangle (2) ? ");
        int type = Integer.parseInt(lecteur.nextLine());

        if(type == 1) {
            System.out.println(aireCarre(cote));
        }
        else if(type == 2) {
            System.out.println(aireTriangle(cote));
        }

    }
}
